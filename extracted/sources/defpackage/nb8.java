package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.search.result.data.GoogleSearchConfigDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class nb8 implements ai5 {
    public final String a;
    public final GoogleSearchConfigDto b;

    public nb8(String str, GoogleSearchConfigDto googleSearchConfigDto) {
        js3.p(str, "suggestQueryString");
        this.a = str;
        this.b = googleSearchConfigDto;
    }

    public static final nb8 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", nb8.class, "suggestQueryString")) {
            throw new IllegalArgumentException("Required argument \"suggestQueryString\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("suggestQueryString");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"suggestQueryString\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("googleSearchConfig")) {
            throw new IllegalArgumentException("Required argument \"googleSearchConfig\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(GoogleSearchConfigDto.class) || Serializable.class.isAssignableFrom(GoogleSearchConfigDto.class)) {
            return new nb8(string, (GoogleSearchConfigDto) bundle.get("googleSearchConfig"));
        }
        throw new UnsupportedOperationException(GoogleSearchConfigDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb8)) {
            return false;
        }
        nb8 nb8Var = (nb8) obj;
        return js3.i(this.a, nb8Var.a) && js3.i(this.b, nb8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        GoogleSearchConfigDto googleSearchConfigDto = this.b;
        return iHashCode + (googleSearchConfigDto == null ? 0 : googleSearchConfigDto.hashCode());
    }

    public final String toString() {
        return "SuggestListFragmentArgs(suggestQueryString=" + this.a + ", googleSearchConfig=" + this.b + ")";
    }
}
