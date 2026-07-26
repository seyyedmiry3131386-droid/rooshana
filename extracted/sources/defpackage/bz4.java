package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.d;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bz4 {
    public final int a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public final float i;
    public final b j;
    public final ArrayList k;
    public c l;
    public final ArrayList m;
    public final int n;
    public final boolean o;
    public int p;
    public final int q;
    public final int r;

    public bz4(b bVar, bz4 bz4Var) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = ErrorDTO.CODE_ACCESS_DENIED;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.j = bVar;
        this.h = bVar.j;
        if (bz4Var != null) {
            this.p = bz4Var.p;
            this.e = bz4Var.e;
            this.f = bz4Var.f;
            this.g = bz4Var.g;
            this.h = bz4Var.h;
            this.k = bz4Var.k;
            this.i = bz4Var.i;
            this.q = bz4Var.q;
        }
    }

    public bz4(b bVar, int i, int i2) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = ErrorDTO.CODE_ACCESS_DENIED;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.a = -1;
        this.j = bVar;
        this.d = i;
        this.c = i2;
        this.h = bVar.j;
        this.q = bVar.k;
    }

    public bz4(b bVar, Context context, XmlResourceParser xmlResourceParser) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = ErrorDTO.CODE_ACCESS_DENIED;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.r = 0;
        int i = bVar.j;
        SparseArray sparseArray = bVar.g;
        this.h = i;
        this.q = bVar.k;
        this.j = bVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.Transition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == eu6.Transition_constraintSetEnd) {
                this.c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    d dVar = new d();
                    dVar.m(context, this.c);
                    sparseArray.append(this.c, dVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.c = bVar.j(context, this.c);
                }
            } else if (index == eu6.Transition_constraintSetStart) {
                this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                if ("layout".equals(resourceTypeName2)) {
                    d dVar2 = new d();
                    dVar2.m(context, this.d);
                    sparseArray.append(this.d, dVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.d = bVar.j(context, this.d);
                }
            } else if (index == eu6.Transition_motionInterpolator) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.g = resourceId;
                    if (resourceId != -1) {
                        this.e = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    }
                } else {
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                }
            } else if (index == eu6.Transition_duration) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.h);
                this.h = i4;
                if (i4 < 8) {
                    this.h = 8;
                }
            } else if (index == eu6.Transition_staggered) {
                this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
            } else if (index == eu6.Transition_autoTransition) {
                this.n = typedArrayObtainStyledAttributes.getInteger(index, this.n);
            } else if (index == eu6.Transition_android_id) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == eu6.Transition_transitionDisable) {
                this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
            } else if (index == eu6.Transition_pathMotionArc) {
                this.p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == eu6.Transition_layoutDuringTransition) {
                this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == eu6.Transition_transitionFlags) {
                this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.d == -1) {
            this.b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
