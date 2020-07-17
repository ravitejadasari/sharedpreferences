Shared Preferences 

Shared Preferences data avaliablity
unintsalling applicatiopn
cleaing data application from setting

getPreferences()
getSharedPreferences()
getDefaultSharedPreferences()

getSharedPreferneces(String Preference_Name,int Mode)

MODE_PRIVATE
MODE_WORLD_READABLE 
MODE_WORLD_WRITABLE
MODE_MULTI_PROCESS
MODER_APPEND
MODE_ENABLE_WRITE_AHEAD_LOGGING

SharedPreference pref=getApplicationContext().getSharedPreferences("MyData",MODE_PRIVATE);
Editor editor=pref.edit();

editor.put("","")

editor.apply("");


SharedPreference pref=getApplicationContext().getSharedPreferences("MyData",MODE_PRIVATE);
pref.getString("",null);



