package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ir.mservices.market.version2.ApplicationLauncher;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class vk1 extends Binder implements IInterface {
    public final vp7 n;
    public final dp3 o;

    public vk1() {
        attachInterface(this, "com.myket.api.IMyketDeveloperApi");
        this.o = (dp3) ((w91) ApplicationLauncher.o.b()).v.get();
        this.n = new vp7(22);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcel parcel3;
        Bundle bundleG;
        int i3;
        Bundle bundleG2;
        Bundle bundleG3;
        zs3 zs3Var = zs3.b;
        int i4 = 1;
        if (i < 1 || i > 16777215) {
            parcel3 = parcel;
        } else {
            parcel3 = parcel;
            parcel3.enforceInterface("com.myket.api.IMyketDeveloperApi");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.myket.api.IMyketDeveloperApi");
            return true;
        }
        switch (i) {
            case 1:
                int i5 = parcel3.readInt();
                this.n.getClass();
                i = i5 <= 3 ? 1 : 0;
                parcel2.writeNoException();
                parcel2.writeInt(i ^ 1);
                return true;
            case 2:
                int i6 = parcel3.readInt();
                String string = parcel3.readString();
                js3.p(string, "packageName");
                dp3 dp3Var = this.o;
                if (dp3Var == null) {
                    js3.V("installManager");
                    throw null;
                }
                if (y97.p(dp3Var, string).equals(zs3Var)) {
                    tk1 tk1Var = new tk1(this, i6, string, i);
                    Void[] voidArr = new Void[0];
                    while (true) {
                        try {
                            Object objQ = tk1Var.q(voidArr);
                            js3.o(objQ, "executeWithoutInterrupt(...)");
                            bundleG = (Bundle) objQ;
                        } catch (InterruptedException unused) {
                        }
                    }
                } else {
                    bundleG = is3.g(new Pair("RESPONSE_CODE", 2));
                }
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundleG.writeToParcel(parcel2, 1);
                return true;
            case 3:
                int i7 = parcel3.readInt();
                vp7 vp7Var = this.n;
                if (i7 <= 3) {
                    i3 = vp7Var.I().d() ? 4 : 5;
                } else {
                    vp7Var.getClass();
                    i3 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 4:
                int i8 = parcel3.readInt();
                String string2 = parcel3.readString();
                js3.p(string2, "packageName");
                dp3 dp3Var2 = this.o;
                if (dp3Var2 == null) {
                    js3.V("installManager");
                    throw null;
                }
                Bundle bundleG4 = !y97.p(dp3Var2, string2).equals(zs3Var) ? is3.g(new Pair("RESPONSE_CODE", 2)) : this.n.H(i8);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundleG4.writeToParcel(parcel2, 1);
                return true;
            case 5:
                int i9 = parcel3.readInt();
                String string3 = parcel3.readString();
                String string4 = parcel3.readString();
                js3.p(string3, "packageName");
                js3.p(string4, "payload");
                dp3 dp3Var3 = this.o;
                if (dp3Var3 == null) {
                    js3.V("installManager");
                    throw null;
                }
                if (y97.p(dp3Var3, string3).equals(zs3Var)) {
                    uk1 uk1Var = new uk1(this, i9, string3, string4, 0);
                    while (true) {
                        try {
                            Object objQ2 = uk1Var.q(new Void[0]);
                            js3.o(objQ2, "executeWithoutInterrupt(...)");
                            bundleG2 = (Bundle) objQ2;
                        } catch (InterruptedException unused2) {
                        }
                    }
                } else {
                    bundleG2 = is3.g(new Pair("RESPONSE_CODE", 2));
                }
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundleG2.writeToParcel(parcel2, 1);
                return true;
            case 6:
                int i10 = parcel3.readInt();
                String string5 = parcel3.readString();
                js3.p(string5, "packageName");
                dp3 dp3Var4 = this.o;
                if (dp3Var4 == null) {
                    js3.V("installManager");
                    throw null;
                }
                if (y97.p(dp3Var4, string5).equals(zs3Var)) {
                    tk1 tk1Var2 = new tk1(this, i10, string5, i4);
                    Void[] voidArr2 = new Void[0];
                    while (true) {
                        try {
                            Object objQ3 = tk1Var2.q(voidArr2);
                            js3.o(objQ3, "executeWithoutInterrupt(...)");
                            bundleG3 = (Bundle) objQ3;
                        } catch (InterruptedException unused3) {
                        }
                    }
                } else {
                    bundleG3 = is3.g(new Pair("RESPONSE_CODE", 2));
                }
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundleG3.writeToParcel(parcel2, 1);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
