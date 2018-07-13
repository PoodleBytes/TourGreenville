package com.udacity.poodlebytes.tourgreenville;

import android.app.Application;
import android.content.Context;

/**
 * thanks to TheBailyBrew for his brilliance on adding this class to make things in context - whatever that means!
 */

public class App extends Application {
      private static Context appContext;
      public static Context getContext() {
          return appContext;
      }


      @Override
      public void onCreate() {
          super.onCreate();
          appContext = this;
      }
  }