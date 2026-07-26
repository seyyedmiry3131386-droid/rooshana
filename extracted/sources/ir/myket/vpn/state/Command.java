package ir.myket.vpn.state;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d70;
import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Command implements Parcelable {
    public final String a;

    public static final class StartApps extends Command implements Parcelable {
        public static final Parcelable.Creator<StartApps> CREATOR = new a();
        public final Notification b;
        public final PendingIntent c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartApps(Notification notification, PendingIntent pendingIntent, String str) {
            super(str);
            js3.p(notification, "notification");
            js3.p(pendingIntent, d70.KEY_PENDING_INTENT);
            js3.p(str, "type");
            this.b = notification;
            this.c = pendingIntent;
            this.d = str;
        }

        @Override // ir.myket.vpn.state.Command
        public final String a() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartApps)) {
                return false;
            }
            StartApps startApps = (StartApps) obj;
            return js3.i(this.b, startApps.b) && js3.i(this.c, startApps.c) && js3.i(this.d, startApps.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StartApps(notification=");
            sb.append(this.b);
            sb.append(", pendingIntent=");
            sb.append(this.c);
            sb.append(", type=");
            return dw1.s(sb, this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            js3.p(parcel, "dest");
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
        }
    }

    public static final class StartDomains extends Command implements Parcelable {
        public static final Parcelable.Creator<StartDomains> CREATOR = new b();
        public final Notification b;
        public final PendingIntent c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartDomains(Notification notification, PendingIntent pendingIntent, String str) {
            super(str);
            js3.p(notification, "notification");
            js3.p(pendingIntent, d70.KEY_PENDING_INTENT);
            js3.p(str, "type");
            this.b = notification;
            this.c = pendingIntent;
            this.d = str;
        }

        @Override // ir.myket.vpn.state.Command
        public final String a() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartDomains)) {
                return false;
            }
            StartDomains startDomains = (StartDomains) obj;
            return js3.i(this.b, startDomains.b) && js3.i(this.c, startDomains.c) && js3.i(this.d, startDomains.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StartDomains(notification=");
            sb.append(this.b);
            sb.append(", pendingIntent=");
            sb.append(this.c);
            sb.append(", type=");
            return dw1.s(sb, this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            js3.p(parcel, "dest");
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
        }
    }

    public static final class Stop extends Command {
        public static final Parcelable.Creator<Stop> CREATOR = new c();
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stop(String str) {
            super(str);
            js3.p(str, "type");
            this.b = str;
        }

        @Override // ir.myket.vpn.state.Command
        public final String a() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stop) && js3.i(this.b, ((Stop) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return o40.y("Stop(type=", this.b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            js3.p(parcel, "dest");
            parcel.writeString(this.b);
        }
    }

    public Command(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
