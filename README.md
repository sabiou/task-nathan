# task-nathan

The goal is to design and create the structure of a SpaceX launch tracker app using the data from the open-source SpaceX REST API https://docs.spacexdata.com/?version=latest

## Features (must have)
* **Upcoming Launch**: detailed list of upcoming launches.
* **Past launch**: detailed list of past launches.
* **Company details**: A screen containing general SpaceX details.

App must use the latest Android jetpack libraries and best practices:

* Architecture: Implement [Google's recommended architecture](https://developer.android.com/jetpack/docs/guide#recommended-app-arch)

* Entirely written in Kotlin.

* Makes use of theses [Android Jetpack](https://developer.android.com/jetpack/) libraries:

  * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) to observe data
  
  * [Data Binding](https://developer.android.com/topic/libraries/data-binding/) to bind UI components in your layouts to data sources.
  
  * [Navigation](https://developer.android.com/guide/navigation) to simplify into a single Activity app.
  
  * [Android KTX](https://developer.android.com/kotlin/ktx) for more fluent use of Android APIs.
  
* [Retrofit](https://square.github.io/retrofit/) for networking
