package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k39 extends l39 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public k39() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // defpackage.l39
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((l39) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.l39
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((l39) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public k39(k39 k39Var, wv wvVar) {
        m39 i39Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = k39Var.c;
        this.d = k39Var.d;
        this.e = k39Var.e;
        this.f = k39Var.f;
        this.g = k39Var.g;
        this.h = k39Var.h;
        this.i = k39Var.i;
        String str = k39Var.k;
        this.k = str;
        if (str != null) {
            wvVar.put(str, this);
        }
        matrix.set(k39Var.j);
        ArrayList arrayList = k39Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof k39) {
                this.b.add(new k39((k39) obj, wvVar));
            } else {
                if (obj instanceof j39) {
                    j39 j39Var = (j39) obj;
                    j39 j39Var2 = new j39(j39Var);
                    j39Var2.e = 0.0f;
                    j39Var2.g = 1.0f;
                    j39Var2.h = 1.0f;
                    j39Var2.i = 0.0f;
                    j39Var2.j = 1.0f;
                    j39Var2.k = 0.0f;
                    j39Var2.l = Paint.Cap.BUTT;
                    j39Var2.m = Paint.Join.MITER;
                    j39Var2.n = 4.0f;
                    j39Var2.d = j39Var.d;
                    j39Var2.e = j39Var.e;
                    j39Var2.g = j39Var.g;
                    j39Var2.f = j39Var.f;
                    j39Var2.c = j39Var.c;
                    j39Var2.h = j39Var.h;
                    j39Var2.i = j39Var.i;
                    j39Var2.j = j39Var.j;
                    j39Var2.k = j39Var.k;
                    j39Var2.l = j39Var.l;
                    j39Var2.m = j39Var.m;
                    j39Var2.n = j39Var.n;
                    i39Var = j39Var2;
                } else if (obj instanceof i39) {
                    i39Var = new i39((i39) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(i39Var);
                Object obj2 = i39Var.b;
                if (obj2 != null) {
                    wvVar.put(obj2, i39Var);
                }
            }
        }
    }
}
