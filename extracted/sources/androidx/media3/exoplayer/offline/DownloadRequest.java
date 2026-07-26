package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import defpackage.fr5;
import defpackage.j29;
import defpackage.vy2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new fr5(12);
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;
    public final ByteRange h;
    public final TimeRange i;

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();
        public final long a;
        public final long b;

        public ByteRange(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            vy2.j(j >= 0);
            vy2.j(j2 >= 0 || j2 == -1);
            this.a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.a == byteRange.a && this.b == byteRange.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 961) + ((int) this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
        }
    }

    public static final class TimeRange implements Parcelable {
        public static final Parcelable.Creator<TimeRange> CREATOR = new b();
        public final long a;
        public final long b;

        public TimeRange(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            vy2.j(j2 >= 0 || j2 == -9223372036854775807L);
            this.a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) obj;
            return this.a == timeRange.a && this.b == timeRange.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 961) + ((int) this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        String str = j29.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
        this.h = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
        this.i = (TimeRange) parcel.readParcelable(TimeRange.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.a.equals(downloadRequest.a) && this.b.equals(downloadRequest.b) && Objects.equals(this.c, downloadRequest.c) && this.d.equals(downloadRequest.d) && Arrays.equals(this.e, downloadRequest.e) && Objects.equals(this.f, downloadRequest.f) && Arrays.equals(this.g, downloadRequest.g) && Objects.equals(this.h, downloadRequest.h) && Objects.equals(this.i, downloadRequest.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        int iHashCode2 = (Arrays.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f;
        int iHashCode3 = (Arrays.hashCode(this.g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.h;
        int iHashCode4 = (iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        TimeRange timeRange = this.i;
        return iHashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
    }
}
