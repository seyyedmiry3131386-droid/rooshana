package ir.mservices.market.movie.download.core.model;

import defpackage.js3;
import defpackage.lw;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadMetaData implements Serializable {
    public static final long serialVersionUID = 100;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public long h;
    public String i;
    public String j;
    public String k;
    public String l;

    public MovieDownloadMetaData(String str, String str2, String str3, String str4, String str5, int i, String str6, long j, String str7, String str8, String str9) {
        js3.p(str3, "movieName");
        js3.p(str9, "movieId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = j;
        this.i = str7;
        this.j = str8;
        this.k = "";
        this.l = str9;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        if (objectInputStream.readInt() != 1) {
            lw.g(null, null, null);
            throw new IOException("Something is wrong with serialized stream");
        }
        this.a = objectInputStream.readUTF();
        this.b = objectInputStream.readUTF();
        String utf = objectInputStream.readUTF();
        js3.o(utf, "readUTF(...)");
        this.c = utf;
        this.d = objectInputStream.readUTF();
        String utf2 = objectInputStream.readUTF();
        js3.o(utf2, "readUTF(...)");
        this.e = utf2;
        this.f = objectInputStream.readInt();
        String utf3 = objectInputStream.readUTF();
        js3.o(utf3, "readUTF(...)");
        this.g = utf3;
        this.h = objectInputStream.readLong();
        String utf4 = objectInputStream.readUTF();
        js3.o(utf4, "readUTF(...)");
        this.i = utf4;
        String utf5 = objectInputStream.readUTF();
        js3.o(utf5, "readUTF(...)");
        this.j = utf5;
        this.k = objectInputStream.readUTF();
        String utf6 = objectInputStream.readUTF();
        js3.o(utf6, "readUTF(...)");
        this.l = utf6;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(1);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        objectOutputStream.writeUTF(str);
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        objectOutputStream.writeUTF(str2);
        objectOutputStream.writeUTF(this.c);
        String str3 = this.d;
        if (str3 == null) {
            str3 = "";
        }
        objectOutputStream.writeUTF(str3);
        objectOutputStream.writeUTF(this.e);
        objectOutputStream.writeInt(this.f);
        objectOutputStream.writeUTF(this.g);
        objectOutputStream.writeLong(this.h);
        objectOutputStream.writeUTF(this.i);
        objectOutputStream.writeUTF(this.j);
        String str4 = this.k;
        if (str4 == null) {
            str4 = "";
        }
        objectOutputStream.writeUTF(str4);
        String str5 = this.l;
        objectOutputStream.writeUTF(str5 != null ? str5 : "");
    }
}
