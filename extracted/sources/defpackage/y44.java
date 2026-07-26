package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.input.internal.d;
import androidx.compose.foundation.text.input.internal.e;
import androidx.compose.foundation.text.selection.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class y44 {
    public final View a;
    public final do3 b;
    public x44 e;
    public f f;
    public v69 g;
    public Rect l;
    public final d m;
    public dp2 c = new us3(8);
    public dp2 d = new us3(9);
    public zh8 h = new zh8("", zi8.b, 4);
    public cj3 i = cj3.f;
    public final ArrayList j = new ArrayList();
    public final Object k = a.b(LazyThreadSafetyMode.c, new hk3(7, this));

    public y44(View view, dp2 dp2Var, do3 do3Var) {
        this.a = view;
        this.b = do3Var;
        this.m = new d(dp2Var, do3Var);
    }

    public final InputConnection a(EditorInfo editorInfo) {
        int i;
        int i2;
        zh8 zh8Var = this.h;
        String str = zh8Var.a.b;
        long j = zh8Var.b;
        cj3 cj3Var = this.i;
        int i3 = cj3Var.d;
        int i4 = cj3Var.c;
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        if (Build.VERSION.SDK_INT >= 24) {
            jr9.x(editorInfo, cj3Var.e);
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if ((i2 & 1) == 1) {
            editorInfo.inputType = i2 | 131072;
            if (cj3Var.d == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = cj3Var.a;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (cj3Var.b) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = zi8.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        iz1.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!l98.a || i4 == 7 || i4 == 8) {
            iz1.d(editorInfo, false);
        } else {
            iz1.d(editorInfo, true);
            i3.y(editorInfo);
        }
        dp2 dp2Var = e.a;
        if (zz1.d()) {
            zz1.a().i(editorInfo);
        }
        qy6 qy6Var = new qy6(this.h, new ca7(27, this), this.i.b, this.e, this.f, this.g);
        this.j.add(new WeakReference(qy6Var));
        return qy6Var;
    }
}
