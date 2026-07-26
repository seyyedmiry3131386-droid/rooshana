package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.reels.data.ReelHomeDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class f17 implements ai5 {
    public final ReelHomeDto a;
    public final String b;

    public f17(ReelHomeDto reelHomeDto, String str) {
        this.a = reelHomeDto;
        this.b = str;
    }

    public static final f17 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", f17.class, "reel")) {
            throw new IllegalArgumentException("Required argument \"reel\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ReelHomeDto.class) && !Serializable.class.isAssignableFrom(ReelHomeDto.class)) {
            throw new UnsupportedOperationException(ReelHomeDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ReelHomeDto reelHomeDto = (ReelHomeDto) bundle.get("reel");
        if (bundle.containsKey("query")) {
            return new f17(reelHomeDto, bundle.getString("query"));
        }
        throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f17)) {
            return false;
        }
        f17 f17Var = (f17) obj;
        return js3.i(this.a, f17Var.a) && js3.i(this.b, f17Var.b);
    }

    public final int hashCode() {
        ReelHomeDto reelHomeDto = this.a;
        int iHashCode = (reelHomeDto == null ? 0 : reelHomeDto.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ReelsFragmentArgs(reel=" + this.a + ", query=" + this.b + ")";
    }
}
