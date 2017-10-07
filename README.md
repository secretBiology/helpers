<a href='https://bintray.com/rohitsuratekar/secret-helpers/general/_latestVersion'><img src='https://api.bintray.com/packages/rohitsuratekar/secret-helpers/general/images/download.svg'></a>

# helpers
helper classes for all secret biology projects

This project is currently in development phase. To get beta functions, use following.

### Specifications
Following are the specifications related to compilations 

     compileSdkVersion 26
     buildToolsVersion "26.0.2"
     minSdkVersion 15
     targetSdkVersion 26

### External libraries used

(1) com.google.code.gson:gson:2.8.2</br>
(2) com.android.support:design:26.1.0</br>

### Currently supported functions

(1) General Functions </br>
(2) General UI views and ViewPageAdapters </br>
(3) Time Utils </br>
(4) Simple Logger </br>
(5) Custom  views and Listeners </br>
(6) PBKDF2 based Encryption compatible with android N

### Deprecated 
(1) SQLight Database Functions and Query Builder</br>
(2) InputView, InputAutoCompleteView, InputMultiAutoCompleteView </br>
(3) AES Encryption with SHA1PRNG (added new EncryptorHelper or General.encrypt() functions)
(4) getColor() function.

### Use for Gradle

     compile 'com.secretbiology.helpers:general:1.1.4'


### For Maven

     <dependency> 
     <groupId>com.secretbiology.helpers</groupId> 
     <artifactId>general</artifactId> 
     <version>1.1.4</version> 
     <type>pom</type> 
     </dependency>
