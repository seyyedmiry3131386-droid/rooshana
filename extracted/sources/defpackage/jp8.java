package defpackage;

import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jp8 implements wa1, al7 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public jp8(hl5 hl5Var) {
        this.a = 2;
        this.b = 0;
        this.c = hl5Var;
        this.d = new nq0();
        this.e = new ArrayList();
    }

    public static void d(String str, int i, int i2) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        is3.j(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        is3.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    @Override // defpackage.al7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.h26 r38) {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp8.a(h26):void");
    }

    public void c(double d, float f) {
        int length = ((float[]) this.c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.d, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.d = Arrays.copyOf((double[]) this.d, length);
        this.c = Arrays.copyOf((float[]) this.c, length);
        this.e = new double[length];
        double[] dArr = (double[]) this.d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.d)[iBinarySearch] = d;
        ((float[]) this.c)[iBinarySearch] = f;
    }

    public void e(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((hl5) this.c).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : l(i);
        ((nq0) this.d).x(childCount, z);
        if (z) {
            q(view);
        }
        recyclerView.addView(view, childCount);
        o oVarO = RecyclerView.O(view);
        g gVar = recyclerView.m;
        if (gVar != null && oVarO != null) {
            gVar.q(oVarO);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((m89) ((sz6) recyclerView.C.get(size))).getClass();
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void f(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((hl5) this.c).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : l(i);
        ((nq0) this.d).x(childCount, z);
        if (z) {
            q(view);
        }
        o oVarO = RecyclerView.O(view);
        if (oVarO != null) {
            if (!oVarO.k() && !oVarO.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(oVarO);
                throw new IllegalArgumentException(o40.w(recyclerView, sb));
            }
            if (RecyclerView.a1) {
                oVarO.toString();
            }
            oVarO.j &= -257;
        } else if (RecyclerView.Z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(o40.w(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void g(int i) {
        int iL = l(i);
        ((nq0) this.d).z(iL);
        RecyclerView recyclerView = (RecyclerView) ((hl5) this.c).b;
        View childAt = recyclerView.getChildAt(iL);
        if (childAt != null) {
            o oVarO = RecyclerView.O(childAt);
            if (oVarO != null) {
                if (oVarO.k() && !oVarO.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(oVarO);
                    throw new IllegalArgumentException(o40.w(recyclerView, sb));
                }
                if (RecyclerView.a1) {
                    oVarO.toString();
                }
                oVarO.a(256);
            }
        } else if (RecyclerView.Z0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iL);
            throw new IllegalArgumentException(o40.w(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iL);
    }

    public int h(String str) throws GlUtil$GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.b, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        is3.i();
        return iGlGetAttribLocation;
    }

    public View i(int i) {
        return ((RecyclerView) ((hl5) this.c).b).getChildAt(l(i));
    }

    public int j() {
        return ((RecyclerView) ((hl5) this.c).b).getChildCount() - ((ArrayList) this.e).size();
    }

    @Override // defpackage.wa1
    public xa1 k() {
        pa2 pa2Var = (pa2) this.f;
        xa1 xa1VarK = pa2Var != null ? pa2Var.k() : null;
        int i = this.b;
        dk0 dk0Var = (dk0) this.c;
        dk0Var.getClass();
        return new lk0(dk0Var, xa1VarK, ((gv) this.d).k(), xa1VarK != null ? new kk0(dk0Var) : null, (en) this.e, i);
    }

    public int l(int i) {
        nq0 nq0Var = (nq0) this.d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((hl5) this.c).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iU = i - (i2 - nq0Var.u(i2));
            if (iU == 0) {
                while (nq0Var.w(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iU;
        }
        return -1;
    }

    public double m(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) this.d, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = (float[]) this.c;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = (double[]) this.d;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (((double) f2) - (d5 * d4))) + ((double[]) this.e)[i];
    }

    public View n(int i) {
        return ((RecyclerView) ((hl5) this.c).b).getChildAt(i);
    }

    public int o() {
        return ((RecyclerView) ((hl5) this.c).b).getChildCount();
    }

    public double p(double d, double d2) {
        double dAbs;
        double dM = m(d) + d2;
        switch (this.b) {
            case 1:
                return Math.signum(0.5d - (dM % 1.0d));
            case 2:
                dAbs = Math.abs((((dM * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dM * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dM * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d2 + dM) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dM * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return ((px4) this.f).w(dM % 1.0d);
            default:
                return Math.sin(6.283185307179586d * dM);
        }
        return 1.0d - dAbs;
    }

    public void q(View view) {
        ((ArrayList) this.e).add(view);
        hl5 hl5Var = (hl5) this.c;
        o oVarO = RecyclerView.O(view);
        if (oVarO != null) {
            View view2 = oVarO.a;
            RecyclerView recyclerView = (RecyclerView) hl5Var.b;
            int i = oVarO.q;
            if (i != -1) {
                oVarO.p = i;
            } else {
                oVarO.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.R()) {
                view2.setImportantForAccessibility(4);
            } else {
                oVarO.q = 4;
                recyclerView.R0.add(oVarO);
            }
        }
    }

    public boolean r(jp8 jp8Var, int i) {
        return jp8Var != null && Objects.equals(((x37[]) this.c)[i], ((x37[]) jp8Var.c)[i]) && Objects.equals(((p62[]) this.d)[i], ((p62[]) jp8Var.d)[i]);
    }

    public boolean s(int i) {
        return ((x37[]) this.c)[i] != null;
    }

    public void t(View view) {
        if (((ArrayList) this.e).remove(view)) {
            hl5 hl5Var = (hl5) this.c;
            o oVarO = RecyclerView.O(view);
            if (oVarO != null) {
                RecyclerView recyclerView = (RecyclerView) hl5Var.b;
                int i = oVarO.p;
                if (recyclerView.R()) {
                    oVarO.q = i;
                    recyclerView.R0.add(oVarO);
                } else {
                    oVarO.a.setImportantForAccessibility(i);
                }
                oVarO.p = 0;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((nq0) this.d).toString() + ", hidden list:" + ((ArrayList) this.e).size();
            case 3:
            default:
                return super.toString();
            case 4:
                return "pos =" + Arrays.toString((double[]) this.d) + " period=" + Arrays.toString((float[]) this.c);
        }
    }

    public jp8(String str, String str2) throws GlUtil$GlException {
        this.a = 3;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        is3.i();
        d(str, iGlCreateProgram, 35633);
        d(str2, iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        is3.j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.c = new cv[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            cv cvVar = new cv(25);
            ((cv[]) this.c)[i] = cvVar;
            ((HashMap) this.e).put(str3, cvVar);
        }
        this.f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.d = new fv[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            fv fvVar = new fv(25);
            ((fv[]) this.d)[i5] = fvVar;
            ((HashMap) this.f).put(str4, fvVar);
        }
        is3.i();
    }

    public jp8(int i) {
        this.a = i;
        switch (i) {
            case 4:
                break;
            default:
                this.d = new gv(20);
                this.e = en.b;
                break;
        }
    }

    public jp8(x37[] x37VarArr, p62[] p62VarArr, rp8 rp8Var, Object obj) {
        this.a = 0;
        vy2.j(x37VarArr.length == p62VarArr.length);
        this.c = x37VarArr;
        this.d = (p62[]) p62VarArr.clone();
        this.e = rp8Var;
        this.f = obj;
        this.b = x37VarArr.length;
    }

    public jp8(y85 y85Var, hl5 hl5Var, byte[] bArr, pv1[] pv1VarArr, int i) {
        this.a = 6;
        this.c = y85Var;
        this.d = hl5Var;
        this.e = bArr;
        this.f = pv1VarArr;
        this.b = i;
    }

    public jp8(dt8 dt8Var, int i) {
        this.a = 5;
        this.f = dt8Var;
        this.c = new ao0(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }

    @Override // defpackage.al7
    public void b(hm8 hm8Var, x72 x72Var, ft8 ft8Var) {
    }
}
