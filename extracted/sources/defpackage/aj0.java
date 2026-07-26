package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements wa1 {
    public static final yg2 f = new yg2(11);
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public /* synthetic */ aj0(int i, int i2, int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = i;
        this.d = obj;
        this.c = i2;
        this.e = obj2;
    }

    public synchronized void a(long j, Object obj) {
        if (this.c > 0) {
            if (j <= ((long[]) this.d)[((this.b + r0) - 1) % ((Object[]) this.e).length]) {
                e();
            }
        }
        f();
        int i = this.b;
        int i2 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i + i2) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i2 + 1;
    }

    public boolean b(int i, int i2) {
        Object objB = ((iz5) ((g96) this.d)).b(i);
        Object objB2 = ((iz5) this.e).b(i2);
        if (objB == objB2) {
            return true;
        }
        RecyclerItem recyclerItem = (RecyclerItem) objB;
        RecyclerItem recyclerItem2 = (RecyclerItem) objB2;
        js3.p(recyclerItem, "oldItem");
        js3.p(recyclerItem2, "newItem");
        MyketRecyclerData myketRecyclerData = recyclerItem2.c;
        MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
        if ((myketRecyclerData2 instanceof g32) && (myketRecyclerData instanceof g32)) {
            return js3.i(myketRecyclerData2, myketRecyclerData);
        }
        lw.g(null, "Implement Equatable in your myketRecyclerData class!! oldItem = " + myketRecyclerData2 + ", newItem = " + myketRecyclerData, null);
        return false;
    }

    public boolean c(int i, int i2) {
        Object objB = ((iz5) ((g96) this.d)).b(i);
        Object objB2 = ((iz5) this.e).b(i2);
        if (objB == objB2) {
            return true;
        }
        RecyclerItem recyclerItem = (RecyclerItem) objB;
        RecyclerItem recyclerItem2 = (RecyclerItem) objB2;
        js3.p(recyclerItem, "oldItem");
        js3.p(recyclerItem2, "newItem");
        MyketRecyclerData myketRecyclerData = recyclerItem2.c;
        MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
        if ((myketRecyclerData2 instanceof g32) && (myketRecyclerData instanceof g32)) {
            js3.n(myketRecyclerData2, "null cannot be cast to non-null type ir.mservices.market.common.ui.recycler.Equatable");
            String uniqueId = ((g32) myketRecyclerData2).getUniqueId();
            js3.n(myketRecyclerData, "null cannot be cast to non-null type ir.mservices.market.common.ui.recycler.Equatable");
            return js3.i(uniqueId, ((g32) myketRecyclerData).getUniqueId());
        }
        lw.g(null, "Implement Equatable in your myketRecyclerData class!! oldItem = " + myketRecyclerData2 + ", newItem = " + myketRecyclerData, null);
        return false;
    }

    public void d(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbB = bl4.B(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbB.append(i3);
        sbB.append(']');
        sn3.a(sbB.toString());
    }

    public synchronized void e() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public void f() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public synchronized byte[] g(int i) {
        for (int i2 = 0; i2 < ((ArrayList) this.e).size(); i2++) {
            byte[] bArr = (byte[]) ((ArrayList) this.e).get(i2);
            if (bArr.length >= i) {
                this.b -= bArr.length;
                ((ArrayList) this.e).remove(i2);
                ((ArrayList) this.d).remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public Boolean h(int i, int i2) {
        if (((iz5) ((g96) this.d)).b(i) == ((iz5) this.e).b(i2)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public int i() {
        vl1 vl1Var = (vl1) this.e;
        if (vl1Var == null) {
            return ((String) this.d).length();
        }
        return (vl1Var.b - vl1Var.c()) + (((String) this.d).length() - (this.c - this.b));
    }

    public boolean j(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!zz1.d()) {
                    return false;
                }
                zz1 zz1VarA = zz1.a();
                if (zz1VarA.c() != 1 || zz1VarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.wa1
    public xa1 k() {
        return new df1((String) this.e, this.b, this.c, (nc2) this.d);
    }

    public boolean l(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return lb7.h(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean m(int i) {
        d(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (o(i) && o(i - 1) && o(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(n(i) || n(i + 1));
    }

    public boolean n(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (js3.i(unicodeBlockOf, unicodeBlock) && js3.i(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return js3.i(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && js3.i(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean o(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!zz1.d()) {
                return false;
            }
            zz1 zz1VarA = zz1.a();
            if (zz1VarA.c() != 1 || zz1VarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean p(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return lb7.h(Character.codePointAt((CharSequence) this.d, i));
    }

    public int q(int i) {
        d(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (o(iFollowing + (-1)) && o(iFollowing) && !n(iFollowing)) ? q(iFollowing) : iFollowing;
    }

    public Object r(long j, boolean z) {
        Object objU = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objU = u();
            j2 = j3;
        }
        return objU;
    }

    public synchronized Object s() {
        return this.c == 0 ? null : u();
    }

    public synchronized Object t(long j) {
        return r(j, true);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                vl1 vl1Var = (vl1) this.e;
                if (vl1Var == null) {
                    return (String) this.d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.d, 0, this.b);
                sb.append((char[]) vl1Var.e, 0, vl1Var.c);
                char[] cArr = (char[]) vl1Var.e;
                int i = vl1Var.d;
                sb.append(cArr, i, vl1Var.b - i);
                String str = (String) this.d;
                sb.append((CharSequence) str, this.c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u() {
        vy2.s(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public int v(int i) {
        d(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (o(iPreceding) && j(iPreceding) && !n(iPreceding)) ? v(iPreceding) : iPreceding;
    }

    public void w(String str, int i, int i2) {
        if (i > i2) {
            sn3.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            sn3.a("start must be non-negative, but was " + i);
        }
        vl1 vl1Var = (vl1) this.e;
        if (vl1Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            js3.n(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            js3.n(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            vl1 vl1Var2 = new vl1();
            vl1Var2.b = iMax;
            vl1Var2.e = cArr;
            vl1Var2.c = length;
            vl1Var2.d = i4;
            this.e = vl1Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > vl1Var.b - vl1Var.c()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            w(str, i, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > vl1Var.c()) {
            int iC = length2 - vl1Var.c();
            int i9 = vl1Var.b;
            do {
                i9 *= 2;
            } while (i9 - vl1Var.b < iC);
            char[] cArr2 = new char[i9];
            ew.z0((char[]) vl1Var.e, cArr2, 0, 0, vl1Var.c);
            int i10 = vl1Var.b;
            int i11 = vl1Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            ew.z0((char[]) vl1Var.e, cArr2, i13, i11, i12 + i11);
            vl1Var.e = cArr2;
            vl1Var.b = i9;
            vl1Var.d = i13;
        }
        int i14 = vl1Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) vl1Var.e;
            ew.z0(cArr3, cArr3, vl1Var.d - i15, i8, i14);
            vl1Var.c = i7;
            vl1Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iC2 = vl1Var.c() + i7;
            int iC3 = vl1Var.c() + i8;
            int i16 = vl1Var.d;
            char[] cArr4 = (char[]) vl1Var.e;
            ew.z0(cArr4, cArr4, vl1Var.c, i16, iC2);
            vl1Var.c += iC2 - i16;
            vl1Var.d = iC3;
        } else {
            vl1Var.d = vl1Var.c() + i8;
            vl1Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) vl1Var.e, vl1Var.c);
        vl1Var.c = str.length() + vl1Var.c;
    }

    public synchronized void x(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.c) {
                ((ArrayList) this.d).add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.e, bArr, f);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.e).add(iBinarySearch, bArr);
                this.b += bArr.length;
                z();
            }
        }
    }

    public synchronized int y() {
        return this.c;
    }

    public synchronized void z() {
        while (this.b > this.c) {
            byte[] bArr = (byte[]) ((ArrayList) this.d).remove(0);
            ((ArrayList) this.e).remove(bArr);
            this.b -= bArr.length;
        }
    }

    public aj0(CharSequence charSequence, int i, Locale locale) {
        this.a = 11;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            sn3.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            sn3.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new vp0(i, charSequence));
    }

    public aj0(int i, byte b) {
        this.a = i;
        switch (i) {
            case 2:
                this.d = new nc2(7);
                this.b = 8000;
                this.c = 8000;
                break;
            case 5:
                break;
            case 10:
                this.d = new long[10];
                this.e = new Object[10];
                break;
            default:
                this.d = new ArrayList();
                this.e = new ArrayList(64);
                this.b = 0;
                this.c = 4096;
                break;
        }
    }

    public aj0(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = 7;
        this.b = i;
        vy2.j(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public aj0(aj0 aj0Var) {
        this.a = 8;
        float[] fArr = (float[]) aj0Var.d;
        this.b = fArr.length / 3;
        this.d = is3.n(fArr);
        this.e = is3.n((float[]) aj0Var.e);
        int i = aj0Var.c;
        if (i == 1) {
            this.c = 5;
        } else if (i != 2) {
            this.c = 4;
        } else {
            this.c = 6;
        }
    }

    public aj0(g96 g96Var, iz5 iz5Var, int i, int i2) {
        this.a = 6;
        this.d = g96Var;
        this.e = iz5Var;
        this.b = i;
        this.c = i2;
    }

    public aj0(y12 y12Var, sk6 sk6Var) {
        this.a = 3;
        this.d = new SparseArray();
        this.e = y12Var;
        int i = yt6.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) sk6Var.c;
        this.b = typedArray.getResourceId(i, 0);
        this.c = typedArray.getResourceId(yt6.TextInputLayout_passwordToggleDrawable, 0);
    }

    public aj0(int i) {
        this.a = 1;
        this.d = new wo8[i];
        this.c = 0;
    }
}
