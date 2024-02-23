# PreferencesClass Usage Guide

`PreferencesClass` is a utility class designed for Android applications to simplify the management of application preferences using Android's `SharedPreferences`. 
It provides an easy and efficient way to **store**, **retrieve**, **remove**, and **check various data types** such as `String`, `Int`, `Boolean`, and `Float`.
This class is ideal for handling user settings and application configurations with minimal boilerplate code.

## Features

- **Easy Storage and Retrieval**: Seamlessly store and retrieve String, Int, Boolean, and Float data types.
- **Flexible Preference Management**: Offers functionality to remove specific preferences or check for the existence of preference keys.
- **Comprehensive Access**: Facilitates retrieval of all stored preferences and supports deletion of all preferences within a specified preference file.

## Setup
To use `PreferencesClass` in your Android project, simply copy the provided class into your project's source directory.
Ensure that your application has access to Android's Context as it is required for accessing SharedPreferences.

## Usage Examples

## Saving Preferences
Save a `String` preference:

```kotlin
PreferencesClass.getInstance().setStringPreference(context, "user_name", "John Doe")
```

Save an `Int` preference:
```kotlin
PreferencesClass.getInstance().setIntPreference(context, "user_age", 30)
```
## Saving Preferences in a Different Preference File

Save a `Boolean` preference in a custom preference file:
```kotlin
PreferencesClass.getInstance().setBooleanPreference(context, "isPremiumUser", true, "app_info")
```
Save an `Int` preference in a custom preference file:
```kotlin
PreferencesClass.getInstance().setIntPreference(context, "user_age", 30, "user_info")
```

## Retrieving Preferences
Retrieve a `String` preference:

```kotlin
val userName = PreferencesClass.getInstance().getStringPreference(context, "user_name")
```
Retrieve an `Int` preference:
```kotlin
val userAge = PreferencesClass.getInstance().getIntPreference(context, "user_age")
```

## Retrieving Preferences with **default value**
Retrieve a `String` preference:

```kotlin
val userName = PreferencesClass.getInstance().getStringPreference(context, "user_name","defaultValue")
```
Retrieve an `Int` preference:
```kotlin
//50 is default value
val userAge = PreferencesClass.getInstance().getIntPreference(context, "user_age",50)
```

## Retrieving Preferences with different file
Retrieve a `String` preference:

```kotlin
val userName = PreferencesClass.getInstance().getStringPreference(context, "user_name","defaultvalue","newFile")
```
Retrieve an `Int` preference:
```kotlin
//50 is default value
val userAge = PreferencesClass.getInstance().getIntPreference(context, "user_age",50,"newFile")
```

## Checking for a Key's Existence
Check if a preference key exists:
```kotlin
val exists = PreferencesClass.getInstance().containsKey(context, "user_name")
```

## Deleting Preferences
Remove a specific preference:
```kotlin
PreferencesClass.getInstance().removePreference(context, "user_name")
```

## Delete all preferences within a specified file:
```kotlin
PreferencesClass.getInstance().deleteAllSharedPreferences(context)
```
## Retrieving All Preferences

The `getAllPreferences` function provides an easy way to retrieve all key-value pairs stored in a specific SharedPreferences file. 
This can be particularly useful for debugging purposes or when you need to display all user preferences.

```kotlin
val allPrefs = PreferencesClass.getInstance().getAllPreferences(context)
for ((key, value) in allPrefs) {
    Log.d("Preferences", "Key: $key, Value: $value")
}

```

## Retrieving All Preferences With Custom File

The `getAllPreferences` function provides an easy way to retrieve all key-value pairs stored in a specific SharedPreferences file.
This can be particularly useful for debugging purposes or when you need to display all user preferences.

```kotlin
val allPrefs = PreferencesClass.getInstance().getAllPreferences(context, "CustomPrefName")
for ((key, value) in allPrefs) {
    Log.d("Preferences", "Key: $key, Value: $value")
}

```

This guide assumes context refers to an instance of Context (e.g., an Activity or Application context). Adjust your implementation accordingly to ensure proper context management.