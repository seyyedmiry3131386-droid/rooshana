package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class em2 extends wi5 {
    public String g;

    @Override // defpackage.wi5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof em2) && super.equals(obj) && js3.i(this.g, ((em2) obj).g);
    }

    @Override // defpackage.wi5
    public final void h(Context context, AttributeSet attributeSet) {
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, qt6.FragmentNavigator);
        js3.o(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(qt6.FragmentNavigator_android_name);
        if (string != null) {
            this.g = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.wi5
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.wi5
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.g;
        if (str == null) {
            sb.append(Ssh2PublicKeyAlgorithmName.NULL);
        } else {
            sb.append(str);
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
