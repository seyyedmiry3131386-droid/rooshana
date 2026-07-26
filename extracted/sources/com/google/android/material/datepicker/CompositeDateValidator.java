package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final f a;
    public final ArrayList b;
    public static final c c = new c();
    public static final d d = new d();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new e();

    public CompositeDateValidator(ArrayList arrayList, f fVar) {
        this.b = arrayList;
        this.a = fVar;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean H0(long j) {
        return this.a.a(this.b, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.b.equals(compositeDateValidator.b) && this.a.getId() == compositeDateValidator.a.getId();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
        parcel.writeInt(this.a.getId());
    }
}
