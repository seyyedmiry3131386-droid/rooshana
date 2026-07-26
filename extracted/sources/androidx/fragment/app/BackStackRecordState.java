package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle$State;
import defpackage.cn2;
import defpackage.p40;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a(0);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackRecordState(p40 p40Var) {
        int size = p40Var.a.size();
        this.a = new int[size * 6];
        if (!p40Var.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cn2 cn2Var = (cn2) p40Var.a.get(i2);
            int i3 = i + 1;
            this.a[i] = cn2Var.a;
            ArrayList arrayList = this.b;
            d dVar = cn2Var.b;
            arrayList.add(dVar != null ? dVar.f : null);
            int[] iArr = this.a;
            iArr[i3] = cn2Var.c ? 1 : 0;
            iArr[i + 2] = cn2Var.d;
            iArr[i + 3] = cn2Var.e;
            int i4 = i + 5;
            iArr[i + 4] = cn2Var.f;
            i += 6;
            iArr[i4] = cn2Var.g;
            this.c[i2] = cn2Var.h.ordinal();
            this.d[i2] = cn2Var.i.ordinal();
        }
        this.e = p40Var.f;
        this.f = p40Var.i;
        this.g = p40Var.t;
        this.h = p40Var.j;
        this.i = p40Var.k;
        this.j = p40Var.l;
        this.k = p40Var.m;
        this.l = p40Var.n;
        this.m = p40Var.o;
        this.n = p40Var.p;
    }

    public final void a(p40 p40Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                p40Var.f = this.e;
                p40Var.i = this.f;
                p40Var.g = true;
                p40Var.j = this.h;
                p40Var.k = this.i;
                p40Var.l = this.j;
                p40Var.m = this.k;
                p40Var.n = this.l;
                p40Var.o = this.m;
                p40Var.p = this.n;
                return;
            }
            cn2 cn2Var = new cn2();
            int i3 = i + 1;
            cn2Var.a = iArr[i];
            if (g.N(2)) {
                Objects.toString(p40Var);
                int i4 = iArr[i3];
            }
            cn2Var.h = Lifecycle$State.values()[this.c[i2]];
            cn2Var.i = Lifecycle$State.values()[this.d[i2]];
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            cn2Var.c = z;
            int i6 = iArr[i5];
            cn2Var.d = i6;
            int i7 = iArr[i + 3];
            cn2Var.e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            cn2Var.f = i9;
            i += 6;
            int i10 = iArr[i8];
            cn2Var.g = i10;
            p40Var.b = i6;
            p40Var.c = i7;
            p40Var.d = i9;
            p40Var.e = i10;
            p40Var.b(cn2Var);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
