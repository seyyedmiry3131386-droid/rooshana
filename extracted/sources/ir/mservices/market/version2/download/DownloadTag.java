package ir.mservices.market.version2.download;

import defpackage.bl4;
import defpackage.c88;
import defpackage.lw;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadTag implements Serializable {
    static final long serialVersionUID = 100;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public String j;
    public String k;
    public long l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public boolean u;

    public DownloadTag(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, long j, boolean z2, String str8, String str9, String str10, String str11, String str12, String str13, Long l, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = c88.a(str);
        this.e = c88.a(str2);
        this.f = c88.a(str3);
        this.g = c88.a(str4);
        this.h = c88.a(str5);
        this.i = z;
        this.j = c88.a(str6);
        this.k = c88.a(str7);
        this.l = j;
        this.m = z2;
        this.n = c88.a(str8);
        this.o = c88.a(str9);
        this.p = c88.a(str10);
        this.q = str11;
        this.r = str12;
        this.s = str13;
        this.t = l == null ? "" : String.valueOf(l);
        this.u = z3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i = objectInputStream.readInt();
        if (i == 14) {
            this.a = objectInputStream.readInt();
            this.b = objectInputStream.readInt();
            this.c = objectInputStream.readInt();
            this.d = (String) objectInputStream.readObject();
            this.e = (String) objectInputStream.readObject();
            this.f = (String) objectInputStream.readObject();
            this.g = (String) objectInputStream.readObject();
            this.h = (String) objectInputStream.readObject();
            this.i = objectInputStream.readBoolean();
            this.j = (String) objectInputStream.readObject();
            this.k = (String) objectInputStream.readObject();
            this.l = objectInputStream.readLong();
            this.m = objectInputStream.readBoolean();
            this.n = (String) objectInputStream.readObject();
            this.o = (String) objectInputStream.readObject();
            this.p = (String) objectInputStream.readObject();
            this.q = (String) objectInputStream.readObject();
            this.r = (String) objectInputStream.readObject();
            this.s = (String) objectInputStream.readObject();
            this.t = (String) objectInputStream.readObject();
            this.u = objectInputStream.readBoolean();
            return;
        }
        if (i == 13) {
            this.a = objectInputStream.readInt();
            this.b = objectInputStream.readInt();
            this.c = objectInputStream.readInt();
            this.d = (String) objectInputStream.readObject();
            this.e = (String) objectInputStream.readObject();
            this.f = (String) objectInputStream.readObject();
            this.g = (String) objectInputStream.readObject();
            this.h = (String) objectInputStream.readObject();
            this.i = objectInputStream.readBoolean();
            this.j = (String) objectInputStream.readObject();
            this.k = (String) objectInputStream.readObject();
            this.l = objectInputStream.readLong();
            this.m = objectInputStream.readBoolean();
            this.n = (String) objectInputStream.readObject();
            this.o = (String) objectInputStream.readObject();
            this.p = (String) objectInputStream.readObject();
            this.q = (String) objectInputStream.readObject();
            this.r = "";
            this.s = "";
            this.t = "";
            this.u = true;
            return;
        }
        if (i == 12) {
            this.a = objectInputStream.readInt();
            this.b = objectInputStream.readInt();
            this.c = objectInputStream.readInt();
            this.d = (String) objectInputStream.readObject();
            this.e = (String) objectInputStream.readObject();
            this.f = (String) objectInputStream.readObject();
            this.g = (String) objectInputStream.readObject();
            this.h = (String) objectInputStream.readObject();
            this.i = objectInputStream.readBoolean();
            this.j = (String) objectInputStream.readObject();
            this.k = (String) objectInputStream.readObject();
            this.l = objectInputStream.readLong();
            this.m = objectInputStream.readBoolean();
            this.n = (String) objectInputStream.readObject();
            this.o = (String) objectInputStream.readObject();
            this.p = "";
            this.q = "other";
            this.r = "";
            this.s = "";
            this.t = "";
            this.u = true;
            return;
        }
        if (i == 11) {
            this.a = objectInputStream.readInt();
            this.b = objectInputStream.readInt();
            this.c = objectInputStream.readInt();
            this.d = (String) objectInputStream.readObject();
            this.e = (String) objectInputStream.readObject();
            this.f = (String) objectInputStream.readObject();
            this.g = (String) objectInputStream.readObject();
            this.h = (String) objectInputStream.readObject();
            this.i = objectInputStream.readBoolean();
            this.j = (String) objectInputStream.readObject();
            this.k = (String) objectInputStream.readObject();
            this.l = objectInputStream.readLong();
            this.m = objectInputStream.readBoolean();
            this.n = (String) objectInputStream.readObject();
            this.o = "";
            this.p = "";
            this.q = "other";
            this.r = "";
            this.s = "";
            this.t = "";
            this.u = true;
            return;
        }
        if (i == 10) {
            this.a = objectInputStream.readInt();
            this.b = objectInputStream.readInt();
            this.c = objectInputStream.readInt();
            this.d = (String) objectInputStream.readObject();
            this.e = (String) objectInputStream.readObject();
            this.f = (String) objectInputStream.readObject();
            this.g = (String) objectInputStream.readObject();
            this.h = (String) objectInputStream.readObject();
            this.i = objectInputStream.readBoolean();
            this.j = (String) objectInputStream.readObject();
            this.k = (String) objectInputStream.readObject();
            this.l = objectInputStream.readLong();
            this.m = false;
            this.n = "";
            this.o = "";
            this.p = "";
            this.q = "other";
            this.r = "";
            this.s = "";
            this.t = "";
            this.u = true;
            return;
        }
        if (i < 1 || i > 9) {
            lw.g(null, null, null);
            throw new IOException("Something is wrong with serialized stream");
        }
        this.a = objectInputStream.readInt();
        this.b = objectInputStream.readInt();
        this.c = objectInputStream.readInt();
        this.d = (String) objectInputStream.readObject();
        this.e = (String) objectInputStream.readObject();
        this.f = (String) objectInputStream.readObject();
        this.g = (String) objectInputStream.readObject();
        this.h = (String) objectInputStream.readObject();
        this.i = objectInputStream.readBoolean();
        this.j = (String) objectInputStream.readObject();
        this.k = (String) objectInputStream.readObject();
        this.l = -1L;
        this.m = false;
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "other";
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(14);
        objectOutputStream.writeInt(this.a);
        objectOutputStream.writeInt(this.b);
        objectOutputStream.writeInt(this.c);
        objectOutputStream.writeObject(this.d);
        objectOutputStream.writeObject(this.e);
        objectOutputStream.writeObject(this.f);
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.h);
        objectOutputStream.writeBoolean(this.i);
        objectOutputStream.writeObject(this.j);
        objectOutputStream.writeObject(this.k);
        objectOutputStream.writeLong(this.l);
        objectOutputStream.writeBoolean(this.m);
        objectOutputStream.writeObject(this.n);
        objectOutputStream.writeObject(this.o);
        objectOutputStream.writeObject(this.p);
        objectOutputStream.writeObject(this.q);
        objectOutputStream.writeObject(this.r);
        objectOutputStream.writeObject(this.s);
        objectOutputStream.writeObject(this.t);
        objectOutputStream.writeBoolean(this.u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadTag{versionCode=");
        sb.append(this.a);
        sb.append(", fileType=");
        sb.append(this.b);
        sb.append(", appDataState=");
        sb.append(this.c);
        sb.append(", refId='");
        sb.append(this.d);
        sb.append("', callbackUrl='");
        sb.append(this.e);
        sb.append("', splitNames='");
        sb.append(this.f);
        sb.append("', preInstall='");
        sb.append(this.g);
        sb.append("', postInstall='");
        sb.append(this.h);
        sb.append("', forceUpdate=");
        sb.append(this.i);
        sb.append(", postInstallIntent='");
        sb.append(this.j);
        sb.append("', postInstallPackageName='");
        sb.append(this.k);
        sb.append("', totalServerSize=");
        sb.append(this.l);
        sb.append(", isDiff=");
        sb.append(this.m);
        sb.append(", type='");
        sb.append(this.n);
        sb.append("', md5='");
        sb.append(this.o);
        sb.append("', installCallbackUrl='");
        sb.append(this.p);
        sb.append("', downloadRef='");
        sb.append(this.q);
        sb.append("', title='");
        sb.append(this.r);
        sb.append("', iconPath='");
        sb.append(this.s);
        sb.append("', fuFileLength=");
        sb.append(this.t);
        sb.append(", isFree=");
        return bl4.A(sb, this.u, '}');
    }
}
