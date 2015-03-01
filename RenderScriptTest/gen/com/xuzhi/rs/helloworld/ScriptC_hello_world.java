/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: C:\\workspace_luna\\RenderScriptTest\\src\\com\\example\\renderscripttest\\hello_world.rs
 */

package com.xuzhi.rs.helloworld;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_hello_world extends ScriptC {
    private static final String __rs_resource_name = "hello_world";
    // Constructor
    public  ScriptC_hello_world(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_hello_world(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gTouchX = 0;
    private int mExportVar_gTouchX;
    public synchronized void set_gTouchX(int v) {
        setVar(mExportVarIdx_gTouchX, v);
        mExportVar_gTouchX = v;
    }

    public int get_gTouchX() {
        return mExportVar_gTouchX;
    }

    public Script.FieldID getFieldID_gTouchX() {
        return createFieldID(mExportVarIdx_gTouchX, null);
    }

    private final static int mExportVarIdx_gTouchY = 1;
    private int mExportVar_gTouchY;
    public synchronized void set_gTouchY(int v) {
        setVar(mExportVarIdx_gTouchY, v);
        mExportVar_gTouchY = v;
    }

    public int get_gTouchY() {
        return mExportVar_gTouchY;
    }

    public Script.FieldID getFieldID_gTouchY() {
        return createFieldID(mExportVarIdx_gTouchY, null);
    }

}

