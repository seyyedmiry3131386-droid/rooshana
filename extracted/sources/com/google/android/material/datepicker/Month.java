package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e29;
import defpackage.jr9;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new m();
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = e29.d(calendar);
        this.a = calendarD;
        this.b = calendarD.get(2);
        this.c = calendarD.get(1);
        this.d = calendarD.getMaximum(7);
        this.e = calendarD.getActualMaximum(5);
        this.f = calendarD.getTimeInMillis();
    }

    public static Month a(int i, int i2) {
        Calendar calendarI = e29.i(null);
        calendarI.set(1, i);
        calendarI.set(2, i2);
        return new Month(calendarI);
    }

    public static Month b(long j) {
        Calendar calendarI = e29.i(null);
        calendarI.setTimeInMillis(j);
        return new Month(calendarI);
    }

    public final String c() {
        if (this.g == null) {
            this.g = jr9.q(this.a.getTimeInMillis());
        }
        return this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    public final int d(Month month) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.b - this.b) + ((month.c - this.c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
