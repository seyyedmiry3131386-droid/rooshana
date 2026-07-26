package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;

/* JADX INFO: loaded from: classes.dex */
public final class ti9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        String strK = null;
        String strK2 = null;
        zaa zaaVar = null;
        int iY = 0;
        int iY2 = 0;
        boolean zU = false;
        int iY3 = 0;
        boolean zU2 = false;
        int iY4 = 0;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iY = cc7.y(i, parcel);
                    break;
                case 2:
                    iY2 = cc7.y(i, parcel);
                    break;
                case 3:
                    zU = cc7.u(i, parcel);
                    break;
                case 4:
                    iY3 = cc7.y(i, parcel);
                    break;
                case 5:
                    zU2 = cc7.u(i, parcel);
                    break;
                case 6:
                    strK = cc7.k(i, parcel);
                    break;
                case 7:
                    iY4 = cc7.y(i, parcel);
                    break;
                case '\b':
                    strK2 = cc7.k(i, parcel);
                    break;
                case '\t':
                    zaaVar = (zaa) cc7.j(parcel, i, zaa.CREATOR);
                    break;
                default:
                    cc7.E(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new FastJsonResponse$Field(iY, iY2, zU, iY3, zU2, strK, iY4, strK2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse$Field[i];
    }
}
