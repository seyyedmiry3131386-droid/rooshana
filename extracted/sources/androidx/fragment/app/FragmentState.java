package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle$State;
import defpackage.o40;
import defpackage.pl2;
import defpackage.t61;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a(4);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public final int n;
    public final boolean o;

    public FragmentState(d dVar) {
        this.a = dVar.getClass().getName();
        this.b = dVar.f;
        this.c = dVar.p;
        this.d = dVar.r;
        this.e = dVar.z;
        this.f = dVar.A;
        this.g = dVar.B;
        this.h = dVar.E;
        this.i = dVar.m;
        this.j = dVar.D;
        this.k = dVar.C;
        this.l = dVar.T.ordinal();
        this.m = dVar.i;
        this.n = dVar.j;
        this.o = dVar.L;
    }

    public final d a(pl2 pl2Var) {
        d dVarA = pl2Var.a(this.a);
        dVarA.f = this.b;
        dVarA.p = this.c;
        dVarA.r = this.d;
        dVarA.s = true;
        dVarA.z = this.e;
        dVarA.A = this.f;
        dVarA.B = this.g;
        dVarA.E = this.h;
        dVarA.m = this.i;
        dVarA.D = this.j;
        dVarA.C = this.k;
        dVarA.T = Lifecycle$State.values()[this.l];
        dVarA.i = this.m;
        dVarA.j = this.n;
        dVarA.L = this.o;
        return dVarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA = o40.A(128, "FragmentState{");
        sbA.append(this.a);
        sbA.append(" (");
        sbA.append(this.b);
        sbA.append(")}:");
        if (this.c) {
            sbA.append(" fromLayout");
        }
        if (this.d) {
            sbA.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sbA.append(" id=0x");
            sbA.append(Integer.toHexString(i));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sbA.append(" tag=");
            sbA.append(str);
        }
        if (this.h) {
            sbA.append(" retainInstance");
        }
        if (this.i) {
            sbA.append(" removing");
        }
        if (this.j) {
            sbA.append(" detached");
        }
        if (this.k) {
            sbA.append(" hidden");
        }
        String str2 = this.m;
        if (str2 != null) {
            t61.y(sbA, " targetWho=", str2, " targetRequestCode=");
            sbA.append(this.n);
        }
        if (this.o) {
            sbA.append(" userVisibleHint");
        }
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }
}
