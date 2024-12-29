cmake_minimum_required(VERSION 3.16)

project(A-10-MFCD VERSION 0.1 LANGUAGES CXX)

set(CMAKE_CXX_STANDARD_REQUIRED ON)

find_package(Qt6 REQUIRED COMPONENTS Quick)

qt_standard_project_setup(REQUIRES 6.5)

qt_add_executable(appA-10-MFCD
    main.cpp
)

qt_add_qml_module(appA-10-MFCD
    URI A-10-MFCD
    VERSION 1.0
    QML_FILES
        Main.qml
        SOURCES menu.h menu.cpp
        SOURCES osb.h osb.cpp
        SOURCES
)

# Qt for iOS sets MACOSX_BUNDLE_GUI_IDENTIFIER automatically since Qt 6.1.
# If you are developing for iOS or macOS you should consider setting an
# explicit, fixed bundle identifier manually though.
set_target_properties(appA-10-MFCD PROPERTIES
#    MACOSX_BUNDLE_GUI_IDENTIFIER com.example.appA-10-MFCD
    MACOSX_BUNDLE_BUNDLE_VERSION ${PROJECT_VERSION}
    MACOSX_BUNDLE_SHORT_VERSION_STRING ${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}
    MACOSX_BUNDLE TRUE
    WIN32_EXECUTABLE TRUE
)

target_link_libraries(appA-10-MFCD
    PRIVATE Qt6::Quick
)

include(GNUInstallDirs)
install(TARGETS appA-10-MFCD
    BUNDLE DESTINATION .
    LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
    RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
)
