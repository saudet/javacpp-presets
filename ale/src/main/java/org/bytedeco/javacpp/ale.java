// Targeted by JavaCPP version 1.4.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class ale extends org.bytedeco.javacpp.presets.ale {
    static { Loader.load(); }

// Parsed from emucore/m6502/src/bspf/src/bspf.hxx

//============================================================================
//
//  BBBBB    SSSS   PPPPP   FFFFFF 
//  BB  BB  SS  SS  PP  PP  FF
//  BB  BB  SS      PP  PP  FF
//  BBBBB    SSSS   PPPPP   FFFF    --  "Brad's Simple Portability Framework"
//  BB  BB      SS  PP      FF
//  BB  BB  SS  SS  PP      FF
//  BBBBB    SSSS   PP      FF
//
// Copyright (c) 1997-1998 by Bradford W. Mott
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: bspf.hxx,v 1.17 2007/07/31 15:46:21 stephena Exp $
//============================================================================

// #ifndef BSPF_HXX
// #define BSPF_HXX

/**
  This file defines various basic data types and preprocessor variables
  that need to be defined for different operating systems.
  <p>
  @author Bradford W. Mott
  @version $Id: bspf.hxx,v 1.17 2007/07/31 15:46:21 stephena Exp $
*/

// Types for 8-bit signed and unsigned integers

// Types for 16-bit signed and unsigned integers

// Types for 32-bit signed and unsigned integers

// The following code should provide access to the standard C++ objects and
// types: cerr, cerr, string, ostream, istream, etc.
// #ifdef BSPF_OLD_STYLE_CXX_HEADERS
//   #include <iostream.h>
//   #include <iomanip.h>
//   #include <string.h>
// #else
//   #include <iostream>
//   #include <iomanip>
//   #include <string>
// #endif
	
// #ifdef HAVE_INTTYPES
//   #include <inttypes.h>
// #endif

// Defines to help with path handling
//ALE  #if defined BSPF_UNIX
public static final String BSPF_PATH_SEPARATOR =  "/";
//ALE  #elif (defined(BSPF_DOS) || defined(BSPF_WIN32) || defined(BSPF_OS2))
//ALE    #define BSPF_PATH_SEPARATOR  "\\"
//ALE  #elif defined BSPF_MAC_OSX
//ALE    #define BSPF_PATH_SEPARATOR  "/"
//ALE  #elif defined BSPF_GP2X
//ALE      #define BSPF_PATH_SEPARATOR  "/"
//ALE  #endif

// I wish Windows had a complete POSIX layer
// #ifdef BSPF_WIN32
//   #define BSPF_strcasecmp stricmp
//   #define BSPF_strncasecmp strnicmp
//   #define BSPF_isblank(c) ((c == ' ') || (c == '\t'))
//   #define BSPF_snprintf _snprintf
//   #define BSPF_vsnprintf _vsnprintf
// #else
//   #define BSPF_strcasecmp strcasecmp
//   #define BSPF_strncasecmp strncasecmp
//   #define BSPF_isblank(c) isblank(c)
//   #define BSPF_snprintf snprintf
//   #define BSPF_vsnprintf vsnprintf
// #endif

// Some convenience functions

// #ifdef _WIN32_WCE
//   #include "missing.h"
// #endif

// #endif


// Parsed from emucore/Event.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Event.hxx,v 1.28 2007/01/30 17:13:07 stephena Exp $
//============================================================================

// #ifndef EVENT_HXX
// #define EVENT_HXX

// #include "m6502/src/bspf/src/bspf.hxx"

/**
  @author  Bradford W. Mott
  @version $Id: Event.hxx,v 1.28 2007/01/30 17:13:07 stephena Exp $
*/
@NoOffset public static class Event extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Event(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Event(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Event position(long position) {
        return (Event)super.position(position);
    }

    /**
      Enumeration of all possible events in Stella, including both
      console and controller event types as well as events that aren't
      technically part of the emulation core
    */
    /** enum Event::Type */
    public static final int
      NoType = 0,
      ConsoleOn = 1, ConsoleOff = 2, ConsoleColor = 3, ConsoleBlackWhite = 4,
      ConsoleLeftDifficultyA = 5, ConsoleLeftDifficultyB = 6,
      ConsoleRightDifficultyA = 7, ConsoleRightDifficultyB = 8,
      ConsoleSelect = 9, ConsoleReset = 10,

      JoystickZeroUp = 11, JoystickZeroDown = 12, JoystickZeroLeft = 13,
      JoystickZeroRight = 14, JoystickZeroFire = 15,
      JoystickOneUp = 16, JoystickOneDown = 17, JoystickOneLeft = 18,
      JoystickOneRight = 19, JoystickOneFire = 20,

      BoosterGripZeroTrigger = 21, BoosterGripZeroBooster = 22,
      BoosterGripOneTrigger = 23, BoosterGripOneBooster = 24,

      PaddleZeroResistance = 25, PaddleZeroFire = 26,
        PaddleZeroDecrease = 27, PaddleZeroIncrease = 28, PaddleZeroAnalog = 29,
      PaddleOneResistance = 30, PaddleOneFire = 31,
        PaddleOneDecrease = 32, PaddleOneIncrease = 33, PaddleOneAnalog = 34,
      PaddleTwoResistance = 35, PaddleTwoFire = 36,
        PaddleTwoDecrease = 37, PaddleTwoIncrease = 38, PaddleTwoAnalog = 39,
      PaddleThreeResistance = 40, PaddleThreeFire = 41,
        PaddleThreeDecrease = 42, PaddleThreeIncrease = 43, PaddleThreeAnalog = 44,

      KeyboardZero1 = 45, KeyboardZero2 = 46, KeyboardZero3 = 47,
      KeyboardZero4 = 48, KeyboardZero5 = 49, KeyboardZero6 = 50,
      KeyboardZero7 = 51, KeyboardZero8 = 52, KeyboardZero9 = 53,
      KeyboardZeroStar = 54, KeyboardZero0 = 55, KeyboardZeroPound = 56,

      KeyboardOne1 = 57, KeyboardOne2 = 58, KeyboardOne3 = 59,
      KeyboardOne4 = 60, KeyboardOne5 = 61, KeyboardOne6 = 62,
      KeyboardOne7 = 63, KeyboardOne8 = 64, KeyboardOne9 = 65,
      KeyboardOneStar = 66, KeyboardOne0 = 67, KeyboardOnePound = 68,

      DrivingZeroClockwise = 69, DrivingZeroCounterClockwise = 70, DrivingZeroValue = 71, 
      DrivingZeroFire = 72,
      DrivingOneClockwise = 73, DrivingOneCounterClockwise = 74, DrivingOneValue = 75,
      DrivingOneFire = 76,
      
      ChangeState = 77, LoadState = 78, SaveState = 79, TakeSnapshot = 80, Quit = 81,
      PauseMode = 82, MenuMode = 83, CmdMenuMode = 84, DebuggerMode = 85, LauncherMode = 86,
      Fry = 87, VolumeDecrease = 88, VolumeIncrease = 89,

      UIUp = 90, UIDown = 91, UILeft = 92, UIRight = 93, UIHome = 94, UIEnd = 95, UIPgUp = 96, UIPgDown = 97,
      UISelect = 98, UINavPrev = 99, UINavNext = 100, UIOK = 101, UICancel = 102,

      LastType = 103;
    /**
      Create a new event object and use the given eventstreamer
    */
    public Event() { super((Pointer)null); allocate(); }
    private native void allocate();
 
    /**
      Destructor
    */
    /**
      Get the value associated with the event of the specified type
    */
    public native @Cast("Int32") int get(@Cast("Event::Type") int type);

    /**
      Set the value associated with the event of the specified type
    */
    public native void set(@Cast("Event::Type") int type, @Cast("Int32") int value);

    /**
      Clears the event array (resets to initial state)
    */
    public native void clear();
}

// #endif


// Parsed from common/Constants.h

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  common_constants.h
 *
 *  Defines a set of constants used by various parts of the player agent code
 *
 **************************************************************************** */

// #ifndef __CONSTANTS_H__
// #define __CONSTANTS_H__

// #include <cassert>
// #include <vector>
// #include <valarray>
// #include <cstdlib>
// #include "../emucore/m6502/src/bspf/src/bspf.hxx"


// Define actions
/** enum Action */
public static final int
    PLAYER_A_NOOP           = 0,
    PLAYER_A_FIRE           = 1,
    PLAYER_A_UP             = 2,
    PLAYER_A_RIGHT          = 3,
    PLAYER_A_LEFT           = 4,
    PLAYER_A_DOWN           = 5,
    PLAYER_A_UPRIGHT        = 6,
    PLAYER_A_UPLEFT         = 7,
    PLAYER_A_DOWNRIGHT      = 8,
    PLAYER_A_DOWNLEFT       = 9,
    PLAYER_A_UPFIRE         = 10,
    PLAYER_A_RIGHTFIRE      = 11,
    PLAYER_A_LEFTFIRE       = 12,
    PLAYER_A_DOWNFIRE       = 13,
    PLAYER_A_UPRIGHTFIRE    = 14,
    PLAYER_A_UPLEFTFIRE     = 15,
    PLAYER_A_DOWNRIGHTFIRE  = 16,
    PLAYER_A_DOWNLEFTFIRE   = 17,
    PLAYER_B_NOOP           = 18,
    PLAYER_B_FIRE           = 19,
    PLAYER_B_UP             = 20,
    PLAYER_B_RIGHT          = 21,
    PLAYER_B_LEFT           = 22,
    PLAYER_B_DOWN           = 23,
    PLAYER_B_UPRIGHT        = 24,
    PLAYER_B_UPLEFT         = 25,
    PLAYER_B_DOWNRIGHT      = 26,
    PLAYER_B_DOWNLEFT       = 27,
    PLAYER_B_UPFIRE         = 28,
    PLAYER_B_RIGHTFIRE      = 29,
    PLAYER_B_LEFTFIRE       = 30,
    PLAYER_B_DOWNFIRE       = 31,
    PLAYER_B_UPRIGHTFIRE    = 32,
    PLAYER_B_UPLEFTFIRE     = 33,
    PLAYER_B_DOWNRIGHTFIRE  = 34,
    PLAYER_B_DOWNLEFTFIRE   = 35,
    RESET                   = 40, // MGB: Use SYSTEM_RESET to reset the environment. 
    UNDEFINED               = 41,
    RANDOM                  = 42,
    SAVE_STATE              = 43,
    LOAD_STATE              = 44,
    SYSTEM_RESET            = 45,
    LAST_ACTION_INDEX       = 50;

public static final int PLAYER_A_MAX = (18);
public static final int PLAYER_B_MAX = (36);

public static native @StdString BytePointer action_to_string(@Cast("Action") int a);

//  Define datatypes

// mode type

// difficulty type

// reward type for RL interface

// Other constant values
public static final int RAM_LENGTH = 128;

// #endif // __CONSTANTS_H__



// Parsed from common/ColourPalette.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ColourPalette.hpp 
 *
 *  Enables conversion from NTSC/SECAM/PAL to RGB via the OSystem's palette.
 **************************************************************************** */

// #ifndef __COLOUR_PALETTE_HPP__
// #define __COLOUR_PALETTE_HPP__ 

// #include <vector>
// #include <string>
// Include obscure header file for uInt32 definition
// #include "../emucore/m6502/src/bspf/src/bspf.hxx"

@NoOffset public static class ColourPalette extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColourPalette(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ColourPalette(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ColourPalette position(long position) {
        return (ColourPalette)super.position(position);
    }


        public ColourPalette() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Converts a given palette value in range [0, 255] into its RGB components. */ 
        public native void getRGB(int val, @ByRef IntPointer r, @ByRef IntPointer g, @ByRef IntPointer b);
        public native void getRGB(int val, @ByRef IntBuffer r, @ByRef IntBuffer g, @ByRef IntBuffer b);
        public native void getRGB(int val, @ByRef int[] r, @ByRef int[] g, @ByRef int[] b); 
        
        /** Converts a given palette value into packed RGB (format 0x00RRGGBB). */
        public native @Cast("uInt32") int getRGB(int val);

        /** Returns the byte-sized grayscale value for this palette index. */ 
        public native @Cast("uInt8") byte getGrayscale(int val); 

        /**
            Applies the current RGB palette to the src_buffer and returns the results in dst_buffer
            For each byte in src_buffer, three bytes are returned in dst_buffer
            8 bits => 24 bits
         */
        public native void applyPaletteRGB(@Cast("uInt8*") BytePointer dst_buffer, @Cast("uInt8*") BytePointer src_buffer, @Cast("size_t") long src_size);
        public native void applyPaletteRGB(@Cast("uInt8*") ByteBuffer dst_buffer, @Cast("uInt8*") ByteBuffer src_buffer, @Cast("size_t") long src_size);
        public native void applyPaletteRGB(@Cast("uInt8*") byte[] dst_buffer, @Cast("uInt8*") byte[] src_buffer, @Cast("size_t") long src_size);

        /**
            Applies the current grayscale palette to the src_buffer and returns the results in dst_buffer
            For each byte in src_buffer, a single byte is returned in dst_buffer
            8 bits => 8 bits
         */
        public native void applyPaletteGrayscale(@Cast("uInt8*") BytePointer dst_buffer, @Cast("uInt8*") BytePointer src_buffer, @Cast("size_t") long src_size);
        public native void applyPaletteGrayscale(@Cast("uInt8*") ByteBuffer dst_buffer, @Cast("uInt8*") ByteBuffer src_buffer, @Cast("size_t") long src_size);
        public native void applyPaletteGrayscale(@Cast("uInt8*") byte[] dst_buffer, @Cast("uInt8*") byte[] src_buffer, @Cast("size_t") long src_size);

        /**
          Loads all defined palettes with PAL color-loss data depending
          on 'state'.
          Sets the palette according to the given palette name.
          <p>
          @param type  The palette type = {standard, z26, user}
          @param displayFormat The display format = { NTSC, PAL, SECAM }
        */
        public native void setPalette(@StdString BytePointer type,
                                @StdString BytePointer displayFormat);
        public native void setPalette(@StdString String type,
                                @StdString String displayFormat);

        /**
            Loads a user-defined palette file (from OSystem::paletteFile), filling the
            appropriate user-defined palette arrays.
        */
        public native void loadUserPalette(@StdString BytePointer paletteFile);
        public native void loadUserPalette(@StdString String paletteFile);
}

// #endif // __COLOUR_PALETTE_HPP__ 




// Parsed from common/ScreenExporter.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ScreenExporter.hpp 
 *
 *  A class for exporting Atari 2600 frames as PNGs.
 *
 **************************************************************************** */

// #ifndef __SCREEN_EXPORTER_HPP__
// #define __SCREEN_EXPORTER_HPP__ 

// #include <string>
// #include "display_screen.h"
// #include "../environment/ale_screen.hpp"

@NoOffset public static class ScreenExporter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScreenExporter(Pointer p) { super(p); }


        /** Creates a new ScreenExporter which can be used to save screens using save(filename). */ 
        public ScreenExporter(@ByRef ColourPalette palette) { super((Pointer)null); allocate(palette); }
        private native void allocate(@ByRef ColourPalette palette);

        /** Creates a new ScreenExporter which will save frames successively in the directory provided.
            Frames are sequentially named with 6 digits, starting at 000000. */
        public ScreenExporter(@ByRef ColourPalette palette, @StdString BytePointer path) { super((Pointer)null); allocate(palette, path); }
        private native void allocate(@ByRef ColourPalette palette, @StdString BytePointer path);
        public ScreenExporter(@ByRef ColourPalette palette, @StdString String path) { super((Pointer)null); allocate(palette, path); }
        private native void allocate(@ByRef ColourPalette palette, @StdString String path);

        /** Save the given screen to the given filename. No paths are created. */
        public native void save(@Const @ByRef ALEScreen screen, @StdString BytePointer filename);
        public native void save(@Const @ByRef ALEScreen screen, @StdString String filename);

        /** Save the given screen according to our own internal numbering. */
        public native void saveNext(@Const @ByRef ALEScreen screen);
}

// #endif // __SCREEN_EXPORTER_HPP__ 





// Parsed from environment/ale_ram.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_ram.hpp
 *
 *  A class that encapsulates the Atari 2600 RAM. Code is provided inline for
 *   efficiency reasonss.
 *  
 **************************************************************************** */

// #ifndef __ALE_RAM_HPP__
// #define __ALE_RAM_HPP__

// #include <string.h>

public static final int RAM_SIZE = (128);

/** A simple wrapper around the Atari RAM. */ 
@NoOffset public static class ALERAM extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALERAM(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ALERAM(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ALERAM position(long position) {
        return (ALERAM)super.position(position);
    }

    public ALERAM() { super((Pointer)null); allocate(); }
    private native void allocate();
    public ALERAM(@Const @ByRef ALERAM rhs) { super((Pointer)null); allocate(rhs); }
    private native void allocate(@Const @ByRef ALERAM rhs);

    public native @ByRef @Name("operator =") ALERAM put(@Const @ByRef ALERAM rhs);

    /** Byte accessors */ 
    public native @Cast("byte_t") byte get(@Cast("unsigned int") int x);
    public native @Cast("byte_t*") @Name("byte") BytePointer _byte(@Cast("unsigned int") int x);
   
    /** Returns the whole array (equivalent to byte(0)). */
    public native @Cast("byte_t*") BytePointer array();

    public native @Cast("size_t") long size();
    /** Returns whether two copies of the RAM are equal */
    public native @Cast("bool") boolean equals(@Const @ByRef ALERAM rhs);
}









// Byte accessors 




// #endif // __ALE_RAM_HPP__



// Parsed from environment/ale_screen.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_screen.hpp
 *
 *  A class that encapsulates an Atari 2600 screen. Code is provided inline for
 *   efficiency reasons.
 *  
 **************************************************************************** */

// #ifndef __ALE_SCREEN_HPP__
// #define __ALE_SCREEN_HPP__

// #include <cassert>
// #include <cstring>
// #include <memory>
// #include <vector>

/** A simple wrapper around an Atari screen. */ 
@NoOffset public static class ALEScreen extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALEScreen(Pointer p) { super(p); }

    public ALEScreen(int h, int w) { super((Pointer)null); allocate(h, w); }
    private native void allocate(int h, int w);
    public ALEScreen(@Const @ByRef ALEScreen rhs) { super((Pointer)null); allocate(rhs); }
    private native void allocate(@Const @ByRef ALEScreen rhs);

    public native @ByRef @Name("operator =") ALEScreen put(@Const @ByRef ALEScreen rhs);

    /** pixel accessors, (row, column)-ordered */
    public native @Cast("pixel_t") byte get(int r, int c);
    public native @Cast("pixel_t*") BytePointer pixel(int r, int c);
    
    /** Access a whole row */
    public native @Cast("pixel_t*") BytePointer getRow(int r);
    
    /** Access the whole array */
    public native @Cast("pixel_t*") BytePointer getArray();

    /** Dimensionality information */
    public native @Cast("size_t") long height();
    public native @Cast("size_t") long width();

    /** Returns the size of the underlying array */
    public native @Cast("size_t") long arraySize();

    /** Returns whether two screens are equal */
    public native @Cast("bool") boolean equals(@Const @ByRef ALEScreen rhs); 
}









// pixel accessors, (row, column)-ordered




// Access a whole row



// #endif // __ALE_SCREEN_HPP__



// Parsed from environment/ale_state.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_state.hpp
 *
 *  A class that stores a copy of the current ALE state. We use one to keep track
 *   of paddle resistance and in search trees.
 *  
 **************************************************************************** */

// #ifndef __ALE_STATE_HPP__ 
// #define __ALE_STATE_HPP__

// #include "../emucore/OSystem.hxx"
// #include "../emucore/Event.hxx"
// #include <string>
// #include "../common/Log.hpp"

@Opaque public static class RomSettings extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RomSettings() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RomSettings(Pointer p) { super(p); }
}

public static final int PADDLE_DELTA = 23000;
// MGB Values taken from Paddles.cxx (Stella 3.3) - 1400000 * [5,235] / 255
public static final int PADDLE_MIN = 27450;
// MGB - was 1290196; updated to 790196... seems to be fine for breakout and pong; 
//  avoids pong paddle going off screen
public static final int PADDLE_MAX = 790196; 
public static final int PADDLE_DEFAULT_VALUE = (((PADDLE_MAX - PADDLE_MIN) / 2) + PADDLE_MIN);

@NoOffset public static class ALEState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALEState(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ALEState(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ALEState position(long position) {
        return (ALEState)super.position(position);
    }

    public ALEState() { super((Pointer)null); allocate(); }
    private native void allocate();
    // Makes a copy of this state, also storing emulator information provided as a string
    public ALEState(@Const @ByRef ALEState rhs, @StdString BytePointer serialized) { super((Pointer)null); allocate(rhs, serialized); }
    private native void allocate(@Const @ByRef ALEState rhs, @StdString BytePointer serialized);
    public ALEState(@Const @ByRef ALEState rhs, @StdString String serialized) { super((Pointer)null); allocate(rhs, serialized); }
    private native void allocate(@Const @ByRef ALEState rhs, @StdString String serialized);

    // Restores a serialized ALEState
    public ALEState(@StdString BytePointer serialized) { super((Pointer)null); allocate(serialized); }
    private native void allocate(@StdString BytePointer serialized);
    public ALEState(@StdString String serialized) { super((Pointer)null); allocate(serialized); }
    private native void allocate(@StdString String serialized);

    /** Resets the system to its start state. numResetSteps 'RESET' actions are taken after the
      *  start. */
    

    /** Returns true if the two states contain the same saved information */
    public native @Cast("bool") boolean equals(@ByRef ALEState state);

    public native void resetPaddles(Event arg0);

    //Apply the special select action
    public native void pressSelect(Event event_obj);

    /** Applies paddle actions. This actually modifies the game state by updating the paddle
      *  resistances. */
    public native void applyActionPaddles(Event event_obj, int player_a_action, int player_b_action);
    /** Sets the joystick events. No effect until the emulator is run forward. */
    public native void setActionJoysticks(Event event_obj, int player_a_action, int player_b_action);

    public native void incrementFrame(int steps/*=1*/);
    public native void incrementFrame();

    public native void resetEpisodeFrameNumber();

    //Get the frames executed so far
    public native int getFrameNumber();

    //Get the number of frames executed this episode.
    public native int getEpisodeFrameNumber();

    /** set the difficulty according to the value.
      * If the first bit is 1, then it will put the left difficulty switch to A (otherwise leave it on B)
      * If the second bit is 1, then it will put the right difficulty switch to A (otherwise leave it on B)
      */
    public native void setDifficulty(@Cast("unsigned int") int value);

    // Returns the current difficulty setting.
    public native @Cast("unsigned int") int getDifficulty();

    //Save the current mode we are supposed to be in.
    public native void setCurrentMode(@Cast("game_mode_t") int value);

    //Get the current mode we are in.
    public native @Cast("game_mode_t") int getCurrentMode();

    public native @StdString BytePointer serialize();

}

// #endif // __ALE_STATE_HPP__



// Parsed from ale_interface.hpp

/* *****************************************************************************
 * The line 99 is based on Xitari's code, from Google Inc.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version 2
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_interface.hpp
 *
 *  The shared library interface.
 **************************************************************************** */
// #ifndef __ALE_INTERFACE_HPP__
// #define __ALE_INTERFACE_HPP__

// #include "emucore/FSNode.hxx"
// #include "emucore/OSystem.hxx"
// #include "os_dependent/SettingsWin32.hxx"
// #include "os_dependent/OSystemWin32.hxx"
// #include "os_dependent/SettingsUNIX.hxx"
// #include "os_dependent/OSystemUNIX.hxx"
// #include "games/Roms.hpp"
// #include "common/display_screen.h"
// #include "environment/stella_environment.hpp"
// #include "common/ScreenExporter.hpp"
// #include "common/Log.hpp"

// #include <string>
// #include <memory>

@MemberGetter public static native @StdString BytePointer Version();

/**
   This class interfaces ALE with external code for controlling agents.
 */
@NoOffset public static class ALEInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALEInterface(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ALEInterface(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ALEInterface position(long position) {
        return (ALEInterface)super.position(position);
    }

  public ALEInterface() { super((Pointer)null); allocate(); }
  private native void allocate();
  // Legacy constructor
  public ALEInterface(@Cast("bool") boolean display_screen) { super((Pointer)null); allocate(display_screen); }
  private native void allocate(@Cast("bool") boolean display_screen);

  // Get the value of a setting.
  public native @StdString BytePointer getString(@StdString BytePointer key);
  public native @StdString String getString(@StdString String key);
  public native int getInt(@StdString BytePointer key);
  public native int getInt(@StdString String key);
  public native @Cast("bool") boolean getBool(@StdString BytePointer key);
  public native @Cast("bool") boolean getBool(@StdString String key);
  public native float getFloat(@StdString BytePointer key);
  public native float getFloat(@StdString String key);

  // Set the value of a setting. loadRom() must be called before the
  // setting will take effect.
  public native void setString(@StdString BytePointer key, @StdString BytePointer value);
  public native void setString(@StdString String key, @StdString String value);
  public native void setInt(@StdString BytePointer key, int value);
  public native void setInt(@StdString String key, int value);
  public native void setBool(@StdString BytePointer key, @Cast("const bool") boolean value);
  public native void setBool(@StdString String key, @Cast("const bool") boolean value);
  public native void setFloat(@StdString BytePointer key, float value);
  public native void setFloat(@StdString String key, float value);

  // Resets the Atari and loads a game. After this call the game
  // should be ready to play. This is necessary after changing a
  // setting for the setting to take effect.
  public native void loadROM(@StdString BytePointer rom_file);
  public native void loadROM(@StdString String rom_file);

  // Applies an action to the game and returns the reward. It is the
  // user's responsibility to check if the game has ended and reset
  // when necessary - this method will keep pressing buttons on the
  // game over screen.
  public native @Cast("reward_t") int act(@Cast("Action") int action);

  // Indicates if the game has ended.
  public native @Cast("bool") boolean game_over();

  // Resets the game, but not the full system.
  public native void reset_game();

  // Returns the vector of modes available for the current game.
  // This should be called only after the rom is loaded.
  public native @Cast("game_mode_t*") @StdVector IntPointer getAvailableModes();

  // Sets the mode of the game.
  // The mode must be an available mode (otherwise it throws an exception).
  // This should be called only after the rom is loaded.
  public native void setMode(@Cast("game_mode_t") int m);

  //Returns the vector of difficulties available for the current game.
  //This should be called only after the rom is loaded. Notice
  // that there are 2 levers, the right and left switches. They
  // are not tied to any specific player. In Venture, for example,
  // we have the following interpretation for the difficulties:
  // Skill          Switch
  // Level          Setting
  //   1         left B/right B
  //   2         left B/right A
  //   3         left A/right B
  //   4         left A/right A
  public native @Cast("difficulty_t*") @StdVector IntPointer getAvailableDifficulties();

  // Sets the difficulty of the game.
  // The difficulty must be an available mode (otherwise it throws an exception).
  // This should be called only after the rom is loaded.
  public native void setDifficulty(@Cast("difficulty_t") int m);

  // Returns the vector of legal actions. This should be called only
  // after the rom is loaded.
  public native @Cast("Action*") @StdVector IntPointer getLegalActionSet();

  // Returns the vector of the minimal set of actions needed to play
  // the game.
  public native @Cast("Action*") @StdVector IntPointer getMinimalActionSet();

  // Returns the frame number since the loading of the ROM
  public native int getFrameNumber();

  // The remaining number of lives.
  public native int lives();

  // Returns the frame number since the start of the current episode
  public native int getEpisodeFrameNumber();

  // Returns the current game screen
  public native @Const @ByRef ALEScreen getScreen();

  //This method should receive an empty vector to fill it with
  //the grayscale colours
  public native void getScreenGrayscale(@Cast("unsigned char*") @StdVector BytePointer grayscale_output_buffer);
  public native void getScreenGrayscale(@Cast("unsigned char*") @StdVector ByteBuffer grayscale_output_buffer);
  public native void getScreenGrayscale(@Cast("unsigned char*") @StdVector byte[] grayscale_output_buffer);

  //This method should receive a vector to fill it with
  //the RGB colours. The first positions contain the red colours,
  //followed by the green colours and then the blue colours
  public native void getScreenRGB(@Cast("unsigned char*") @StdVector BytePointer output_rgb_buffer);
  public native void getScreenRGB(@Cast("unsigned char*") @StdVector ByteBuffer output_rgb_buffer);
  public native void getScreenRGB(@Cast("unsigned char*") @StdVector byte[] output_rgb_buffer);

  // Returns the current RAM content
  public native @Const @ByRef ALERAM getRAM();

  // Saves the state of the system
  public native void saveState();

  // Loads the state of the system
  public native void loadState();

  // This makes a copy of the environment state. This copy does *not* include pseudorandomness,
  // making it suitable for planning purposes. By contrast, see cloneSystemState.
  public native @ByVal ALEState cloneState();

  // Reverse operation of cloneState(). This does not restore pseudorandomness, so that repeated
  // calls to restoreState() in the stochastic controls setting will not lead to the same outcomes.
  // By contrast, see restoreSystemState.
  public native void restoreState(@Const @ByRef ALEState state);

  // This makes a copy of the system & environment state, suitable for serialization. This includes
  // pseudorandomness and so is *not* suitable for planning purposes.
  public native @ByVal ALEState cloneSystemState();

  // Reverse operation of cloneSystemState.
  public native void restoreSystemState(@Const @ByRef ALEState state);

  // Save the current screen as a png file
  public native void saveScreenPNG(@StdString BytePointer filename);
  public native void saveScreenPNG(@StdString String filename);

  // Creates a ScreenExporter object which can be used to save a sequence of frames. Ownership 
  // said object is passed to the caller. Frames are saved in the directory 'path', which needs
  // to exists. 
  public native ScreenExporter createScreenExporter(@StdString BytePointer path);
  public native ScreenExporter createScreenExporter(@StdString String path);
  
  
  
  
  public native int max_num_frames(); public native ALEInterface max_num_frames(int max_num_frames);
  // Display ALE welcome message
  public static native @StdString BytePointer welcomeMessage();
  public static native void disableBufferedIO();
  
  
}

// #endif


}
