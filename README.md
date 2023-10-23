# Assignment-2-Profile Screen in Jetpack Compose

This repository contains a profile screen implemented using Jetpack Compose, the modern UI toolkit for Android.

## Features

- Display a user profile picture, name, and location.
- Follow and message action buttons.
- A grid display of user images.

## Preview

[recording.webm](https://github.com/Khairul-Blockcode/Assignment-2-ProfileScreen/assets/99964571/a30caa75-1fc4-48ba-95f8-0e51e589aed9)

## Setup

1. Clone the repository:

```bash
git clone https://github.com/your-username/assignment_2_profilescreen.git
```

2. Open the project using Android Studio.

3. Make sure you have the Jetpack Compose toolkit set up in your Android Studio.

4. Run the project on an emulator or physical device.

## Implementation Details

The `ProfileScreen` composable function takes in:
- `profilePicPainter`: A painter representing the user's profile picture.
- `name`: The user's name.
- `location`: The user's location.
- `imageList`: A list of painters representing user images.

The screen consists of:
- A `ConstraintLayout` is used to position the profile picture, name, location, and action buttons.
- A `LazyVerticalGrid` to display the user images in a grid format.

Custom text styles and font families (`Comfortaa` & `RobotoBold`) are used to style the text elements.

## Dependencies

This project uses:
- Jetpack Compose for UI.
- ConstraintLayout Compose for layout design.
- AndroidX libraries for backward compatibility.

## Contributing

Feel free to open issues or PRs if you find any bugs or have suggestions for improvements!

## License

This project is under the MIT license. See the [LICENSE](LICENSE) for more information.

---
