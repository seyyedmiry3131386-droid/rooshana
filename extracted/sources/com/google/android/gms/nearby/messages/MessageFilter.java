package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageFilter> CREATOR = new sk9(19);
    public final int a;
    public final List b;
    public final List c;
    public final boolean d;
    public final List e;
    public final int f;

    static {
        new MessageFilter(2, new ArrayList(new HashSet()), new ArrayList(), true, new ArrayList(new HashSet()), 0);
    }

    public MessageFilter(int i, ArrayList arrayList, ArrayList arrayList2, boolean z, ArrayList arrayList3, int i2) {
        this.a = i;
        rq4.n(arrayList);
        this.b = DesugarCollections.unmodifiableList(arrayList);
        this.d = z;
        this.c = DesugarCollections.unmodifiableList(arrayList2 == null ? Collections.EMPTY_LIST : arrayList2);
        this.e = DesugarCollections.unmodifiableList(arrayList3 == null ? Collections.EMPTY_LIST : arrayList3);
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.d == messageFilter.d && vy2.w(this.b, messageFilter.b) && vy2.w(this.c, messageFilter.c) && vy2.w(this.e, messageFilter.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.e});
    }

    public final String toString() {
        return "MessageFilter{includeAllMyTypes=" + this.d + ", messageTypes=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.H(parcel, 1, this.b, false);
        uy6.H(parcel, 2, this.c, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.H(parcel, 4, this.e, false);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.f);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
