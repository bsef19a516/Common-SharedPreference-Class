import android.content.Context

class PreferencesClass {
    companion object {
        private const val DEFAULT_PREF_NAME = "AppsPref"
        private lateinit var instance: PreferencesClass
        fun getInstance(): PreferencesClass {
            if (!::instance.isInitialized) {
                instance = PreferencesClass()
            }
            return instance
        }

    }

    // String Preference Functions
    fun getStringPreference(context: Context, key: String): String =
        getStringPreference(context, key, "", DEFAULT_PREF_NAME)

    fun getStringPreference(context: Context, key: String, defaultValue: String): String =
        getStringPreference(context, key, defaultValue, DEFAULT_PREF_NAME)


    fun getStringPreference(
            context: Context, key: String, defaultValue: String, fileName: String): String {
        val sharedPref = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
        return sharedPref.getString(key, defaultValue) ?: defaultValue
    }

    fun setStringPreference(
            context: Context, key: String, value: String, prefName: String = DEFAULT_PREF_NAME
                           ) {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString(key, value)
            apply()
        }
    }

    fun getIntPreference(context: Context, key: String): Int =
        getIntPreference(context, key, 0, DEFAULT_PREF_NAME)

    fun getIntPreference(context: Context, key: String, defaultValue: Int): Int =
        getIntPreference(context, key, defaultValue, DEFAULT_PREF_NAME)

    fun getIntPreference(context: Context, key: String, defaultValue: Int, fileName: String): Int {
        val sharedPref = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
        return sharedPref.getInt(key, defaultValue)
    }


    fun setIntPreference(
            context: Context, key: String, value: Int, prefName: String = DEFAULT_PREF_NAME
                        ) {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putInt(key, value)
            apply()
        }
    }

    fun getBooleanPreference(context: Context, key: String): Boolean =
        getBooleanPreference(context, key, false, DEFAULT_PREF_NAME)

    fun getBooleanPreference(context: Context, key: String, defaultValue: Boolean): Boolean =
        getBooleanPreference(context, key, defaultValue, DEFAULT_PREF_NAME)

    fun getBooleanPreference(
            context: Context, key: String, defaultValue: Boolean, fileName: String): Boolean {
        val sharedPref = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(key, defaultValue)
    }

    fun setBooleanPreference(
            context: Context, key: String, value: Boolean, prefName: String = DEFAULT_PREF_NAME
                            ) {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putBoolean(key, value)
            apply()
        }
    }

    fun getFloatPreference(context: Context, key: String): Float =
        getFloatPreference(context, key, 0.0f, DEFAULT_PREF_NAME)

    fun getFloatPreference(context: Context, key: String, defaultValue: Float): Float =
        getFloatPreference(context, key, defaultValue, DEFAULT_PREF_NAME)

    fun getFloatPreference(
            context: Context, key: String, defaultValue: Float, fileName: String): Float {
        val sharedPref = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
        return sharedPref.getFloat(key, defaultValue)
    }

    fun setFloatPreference(
            context: Context, key: String, value: Float, prefName: String = DEFAULT_PREF_NAME
                          ) {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putFloat(key, value)
            apply()
        }
    }

    fun containsKey(context: Context, key: String, prefName: String = DEFAULT_PREF_NAME): Boolean {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        return sharedPref.contains(key)
    }

    fun getAllPreferences(context: Context, prefName: String = DEFAULT_PREF_NAME): Map<String, *> {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        return sharedPref.all
    }

    fun removePreference(context: Context, key: String, prefName: String = DEFAULT_PREF_NAME) {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            remove(key)
            apply()
        }
    }

    fun deleteAllSharedPreferences(context: Context, prefName: String = DEFAULT_PREF_NAME) {
        val sharedPref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            clear()
            apply()
        }
    }

}