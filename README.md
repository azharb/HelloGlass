Hello Glass
============
Google Glass team recently unveiled the Glass Development Kit (GDK) without a 'Hello World' sample project. This project helps fill that gap.

### What is it? 
The project is pretty straightforward. If you've done Android development before, all you'll have to do is download Android SDK v4.0.3 (API 15) along with the Google GDK Sneak Peak that is available inside that bundle. Open the project in IntelliJ and run on your Glass.

### What will it look like?
You should see something like this: 
![image](https://lh6.googleusercontent.com/-sdZIouRZYJ4/UppGEze2HGI/AAAAAAAABWI/pXUx5C_1bz4/w958-h539-no/20131130_150801_317_x.jpg)

Feel free to contribute to the project and make it better if you like! :)


-----------------------

### New to Android?

#### What you need:
Install the [Android SDK](http://developer.android.com/sdk/index.html). The Android developer's website recommends you use Andrioid Studio or Eclipse as your IDE but I used [IntelliJ](http://www.jetbrains.com/idea/) to build this project. 

#### Okay, next?
Download this source code and open the project in IntelliJ. Before we run the project on your Glass, let's make sure we have everything we need. 

- Connect your Glass to your computer via USB. Open up your terminal and type 'adb devices -l'. You should see a device listed. 
	- Couldn't find your device? Follow Step #4 and #5 [here](https://developers.google.com/glass/develop/gdk/quick-start#setting_up_the_development_environment) under For Android Beginners > Setting up the development environment
- Build the project in IntelliJ by going to Build > Compile or Rebuild Project. You shouldn't have any errors.
- With your project selected, go to Run > Edit Configurations. Make sure that your project is selected on the left panel and on the right. Find the Target Device section in the General tab. Make sure that a USB Device is selected. Hit OK and exit that window. 
- You are now ready to run the project. 

#### Still confused?
If you are still confused about the steps outlined above, do the following: 

- Comment on [this thread](https://www.glass-community.com/t5/Glassware-Developers/Hello-Glass-project-on-GitHub/gpm-p/32307) on Glass Community to request clarifications.  
- Post to [StackOverflow](http://stackoverflow.com/questions/tagged/google-glass) for help. Glass dev team is expected to monitor discussions there to help out. 
 