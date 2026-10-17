# 30 Days of Fitness (Jetpack Compose)

Starter code for the "Build beautiful apps" project of Android Basics with Compose, Unit 3, Pathway 3.

## Setup

1. In Android Studio, create a new project: **Empty Activity** (Jetpack Compose), name `Fit30`, package `com.example.fit30`.
2. Delete the generated `MainActivity.kt` and the files inside `ui/theme`.
3. Copy the files from this folder into `app/src/main/java/com/example/fit30/`, keeping the same sub-folders.
4. In `app/build.gradle(.kts)`, make sure these dependencies exist (the Compose template usually has most of them):

```kotlin
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
implementation("androidx.compose.material:material-icons-core")
```

If your project uses a version catalog, add the same libraries there instead. Sync Gradle, then run the app.

## Structure

```
com.example.fit30
├── entity/       FitnessDay.kt         the data (one day)
├── service/      FitnessService.kt     the 30 days list
├── controller/   FitnessController.kt  ViewModel: completed days and progress
├── ui/           FitnessApp.kt         screen, progress bar, expandable cards
│   └── theme/    Color, Type, Shape, Theme
└── MainActivity.kt
```

## What it uses from the pathway

- Material theming: custom colors (light and dark), typography and shapes
- `LazyColumn` for the list
- `animateContentSize` with a spring for the expandable cards
- Accessibility: content descriptions on icons and the progress bar

## Ideas to extend it

- Save completed days with Room (an `@Entity` version of `FitnessDay`, a DAO, and a service that reads from it)
- Add an image per day
- Add a reminder notification
