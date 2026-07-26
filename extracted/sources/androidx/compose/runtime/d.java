package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c08;
import defpackage.g08;
import defpackage.i08;
import defpackage.vt2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                double d = parcel.readDouble();
                ParcelableSnapshotMutableDoubleState parcelableSnapshotMutableDoubleState = new ParcelableSnapshotMutableDoubleState();
                c08 c08VarJ = g08.j();
                i08 i08Var = new i08(c08VarJ.g(), d);
                if (!(c08VarJ instanceof vt2)) {
                    i08Var.b = new i08(1, d);
                }
                parcelableSnapshotMutableDoubleState.b = i08Var;
                return parcelableSnapshotMutableDoubleState;
            case 1:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 2:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            default:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ParcelableSnapshotMutableDoubleState[i];
            case 1:
                return new ParcelableSnapshotMutableFloatState[i];
            case 2:
                return new ParcelableSnapshotMutableIntState[i];
            default:
                return new ParcelableSnapshotMutableLongState[i];
        }
    }
}
