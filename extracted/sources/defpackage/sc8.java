package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.survey.data.ApplicationSurveyDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class sc8 implements ai5 {
    public final ApplicationSurveyDto a;
    public final String b;

    public sc8(ApplicationSurveyDto applicationSurveyDto, String str) {
        js3.p(applicationSurveyDto, "data");
        js3.p(str, "packageName");
        this.a = applicationSurveyDto;
        this.b = str;
    }

    public static final sc8 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", sc8.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ApplicationSurveyDto.class) && !Serializable.class.isAssignableFrom(ApplicationSurveyDto.class)) {
            throw new UnsupportedOperationException(ApplicationSurveyDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ApplicationSurveyDto applicationSurveyDto = (ApplicationSurveyDto) bundle.get("data");
        if (applicationSurveyDto == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string != null) {
            return new sc8(applicationSurveyDto, string);
        }
        throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc8)) {
            return false;
        }
        sc8 sc8Var = (sc8) obj;
        return js3.i(this.a, sc8Var.a) && js3.i(this.b, sc8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SurveyFragmentArgs(data=" + this.a + ", packageName=" + this.b + ")";
    }
}
