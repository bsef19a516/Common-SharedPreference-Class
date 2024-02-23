# PreferencesClass Usage Guide

`PreferencesClass` simplifies managing application preferences in Android apps, facilitating the storage and retrieval of simple key-value pairs using Android's `SharedPreferences`. This utility class supports saving, retrieving, removing, and checking various data types, such as `String`, `Int`, `Boolean`, and `Float`, enhancing the ease of handling user settings and application configurations.

## Features

- **Easy Storage and Retrieval**: Supports `String`, `Int`, `Boolean`, and `Float` data types.
- **Preference Management**: Enables removal of specific preferences and checking for the existence of preference keys.
- **Comprehensive Access**: Allows retrieval of all stored preferences and deletion of all preferences within a file.
- **Flexible Saving Options**: Offers both immediate and asynchronous saving of preferences.

## Setup

`SharedPreferences` are stored in the app's private storage space. No special permissions are required in your Android manifest file to use `SharedPreferences`.

## Usage Examples

### Saving Preferences

Save a `String` preference:

```kotlin
PreferencesClass.getInstance().setStringPreference(context, "user_name", "John Doe")
```

Save an `Int` preference:
    
```kotlin
PreferencesClass.getInstance().setIntPreference(context, "user_age", 30)
```

### Retrieving Preferences
To retrieve a saved preference, use the corresponding get method. Here's how to get a `String` preference:

```kotlin
val userName = PreferencesClass.getInstance().getStringPreference(context, "user_name", "Default Name")
```

To get an `Int` preference:

```kotlin
val userName = PreferencesClass.getInstance().getStringPreference(context, "user_name", "Default Name")
```

### Removing a Specific Preference
To remove a specific preference:

```kotlin
PreferencesClass.getInstance().removePreference(context, "user_name")
```

### Checking for a Key
To check if a preference key exists:

```kotlin
val exists = PreferencesClass.getInstance().containsKey(context, "user_name")
```

### Deleting All Preferences
To clear all preferences:

```kotlin
PreferencesClass.getInstance().deleteAllSharedPreferences(context)
```