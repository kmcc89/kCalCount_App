package com.kevmc.kcalcount;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by kevmc on 23/05/2018.
 */

//When we change the first Void parameter to String we must also change the parameter type of doInBackground to string
//When we onPostExecute to take a string type argument we must change the 3rd AsyncTask parameter to string
//we must also change the return type of doInBackground method to string
public class BackgroundWorker extends AsyncTask<String, Void, String> {

    Context context;

    //alert dialog to show data - initiate in onPreExecute method
    AlertDialog alertDialog;

    BackgroundWorker(Context ctx){
        context = ctx;
    }


    @Override
    protected String doInBackground(String... params) {

        //get type from params - a string we sent from GeneralFood class via execute method AsyncTask class
        String type = params[0];

        String result = "";

        String find_food_url = "http://10.0.2.2/kCalCountFiles/showFood.php";

        if(type.equals("findFood")){

            try{

                //get food name from params
                String food_name = params[1];

                //create url object and pass it url defined above
                URL url = new URL(find_food_url);

                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

                //set request method and doInput and doOutput of httpURLConn object
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);

                //create instance of output stream and connect it to out http url connection object
                OutputStream outputStream = httpURLConnection.getOutputStream();

                //create instance of buffered writer and connect it to our outputStream object
                /*
                We use the buffWriter to send our data through url using POST - php script can then take
                the data needed from the url and use it to perform queries to the database
                 */
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));

                //create string with the data we want to post
                String post_data = URLEncoder.encode("food_name", "UTF-8")+"="+URLEncoder.encode(food_name,"UTF-8");

                //write data to the buffer
                bufferedWriter.write(post_data);

                //flush and close buffer and close output stream
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                //Read response from post request
                //create input stream and connect it to our httpUrlConnection
                InputStream inputStream = httpURLConnection.getInputStream();

                //create buffered Reader to take data from the input stream
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));

                //read response line by line
                result = "";
                String line = "";

                while((line = bufferedReader.readLine()) != null){
                    result += line;
                }

                //close reader and input stream.  disconnect from http url connection
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();


                return result;


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result+" !!!!";
    }

    @Override
    protected void onPreExecute(){
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Set in preExecute");
    }

    @Override
    protected void onPostExecute(String result){
        alertDialog.setTitle("Inside post execute");
        alertDialog.setMessage("Result "+result+" result");
        alertDialog.show();

    }

    @Override
    protected void onProgressUpdate(Void... values){
        super.onProgressUpdate(values);
    }
}
