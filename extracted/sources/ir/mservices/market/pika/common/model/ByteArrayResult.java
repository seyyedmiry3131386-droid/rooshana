package ir.mservices.market.pika.common.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.yd1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteArrayResult implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 3554807128761889418L;

    public static final class AcceptConnection extends ByteArrayResult {
        public static final AcceptConnection INSTANCE = new AcceptConnection();

        private AcceptConnection() {
            super(null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public static final class ConnectHandShake extends ByteArrayResult {
        public static final String API_VERSION_SERIALISED_NAME = "b";
        public static final Companion Companion = new Companion(null);
        public static final String SUPPORTED_ABI_SERIALISED_NAME = "a";
        public static final long serialVersionUID = -2978781067354120738L;
        private final List<String> a;
        private int apiVersion;
        private final int b;
        private List<String> supportedAbi;

        public static final class Companion {
            public /* synthetic */ Companion(yd1 yd1Var) {
                this();
            }

            private Companion() {
            }
        }

        public ConnectHandShake(List<String> list, int i) {
            super(null);
            this.supportedAbi = list;
            this.apiVersion = i;
            this.a = EmptyList.a;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            ObjectInputStream.GetField fields = objectInputStream.readFields();
            this.supportedAbi = (List) fields.get("a", EmptyList.a);
            this.apiVersion = fields.get("b", -1);
        }

        private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
            js3.o(putFieldPutFields, "putFields(...)");
            putFieldPutFields.put("a", this.supportedAbi);
            putFieldPutFields.put("b", this.apiVersion);
            objectOutputStream.writeFields();
        }

        public final List<String> getA() {
            return this.a;
        }

        public final int getApiVersion() {
            return this.apiVersion;
        }

        public final int getB() {
            return this.b;
        }

        public final List<String> getSupportedAbi() {
            return this.supportedAbi;
        }

        public final void setApiVersion(int i) {
            this.apiVersion = i;
        }

        public final void setSupportedAbi(List<String> list) {
            this.supportedAbi = list;
        }
    }

    public /* synthetic */ ByteArrayResult(yd1 yd1Var) {
        this();
    }

    private ByteArrayResult() {
    }

    public static final class AppInfo extends ByteArrayResult {
        public static final Companion Companion = new Companion(null);
        public static final String ID_SERIALISED_NAME = "a";
        public static final String IMG_SERIALISED_NAME = "e";
        public static final String IS_SPLIT_SERIALISED_NAME = "f";
        public static final String IS_SUPPORTED_SERIALISED_NAME = "g";
        public static final String NAME_SERIALISED_NAME = "d";
        public static final String PACKAGE_NAME_SERIALISED_NAME = "b";
        public static final String VERSION_CODE_SERIALISED_NAME = "c";
        public static final long serialVersionUID = 6401847470903160374L;
        private final long a;
        private final String b;
        private final int c;
        private final String d;
        private final byte[] e;
        private final boolean f;
        private final boolean g;
        private long id;
        private byte[] img;
        private boolean isSplitApk;
        private boolean isSupported;
        private String name;
        private String packageName;
        private int versionCode;

        public static final class Companion {
            public /* synthetic */ Companion(yd1 yd1Var) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppInfo(long j, String str, int i, String str2, byte[] bArr, boolean z, boolean z2) {
            super(null);
            js3.p(str, "packageName");
            js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            js3.p(bArr, "img");
            this.id = j;
            this.packageName = str;
            this.versionCode = i;
            this.name = str2;
            this.img = bArr;
            this.isSplitApk = z;
            this.isSupported = z2;
            this.a = -1L;
            this.b = "";
            this.d = "";
            this.e = new byte[0];
        }

        private final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            ObjectInputStream.GetField fields = objectInputStream.readFields();
            this.id = fields.get("a", -1L);
            Object obj = fields.get("b", "");
            js3.n(obj, "null cannot be cast to non-null type kotlin.String");
            this.packageName = (String) obj;
            this.versionCode = fields.get(VERSION_CODE_SERIALISED_NAME, -1);
            Object obj2 = fields.get(NAME_SERIALISED_NAME, "");
            js3.n(obj2, "null cannot be cast to non-null type kotlin.String");
            this.name = (String) obj2;
            Object obj3 = fields.get(IMG_SERIALISED_NAME, new byte[0]);
            js3.n(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            this.img = (byte[]) obj3;
            this.isSplitApk = fields.get(IS_SPLIT_SERIALISED_NAME, false);
            this.isSupported = fields.get(IS_SUPPORTED_SERIALISED_NAME, false);
        }

        private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
            js3.o(putFieldPutFields, "putFields(...)");
            putFieldPutFields.put("a", this.id);
            putFieldPutFields.put("b", this.packageName);
            putFieldPutFields.put(VERSION_CODE_SERIALISED_NAME, this.versionCode);
            putFieldPutFields.put(NAME_SERIALISED_NAME, this.name);
            putFieldPutFields.put(IMG_SERIALISED_NAME, this.img);
            putFieldPutFields.put(IS_SPLIT_SERIALISED_NAME, this.isSplitApk);
            putFieldPutFields.put(IS_SUPPORTED_SERIALISED_NAME, this.isSupported);
            objectOutputStream.writeFields();
        }

        public final long getA() {
            return this.a;
        }

        public final String getB() {
            return this.b;
        }

        public final int getC() {
            return this.c;
        }

        public final String getD() {
            return this.d;
        }

        public final byte[] getE() {
            return this.e;
        }

        public final boolean getF() {
            return this.f;
        }

        public final boolean getG() {
            return this.g;
        }

        public final long getId() {
            return this.id;
        }

        public final byte[] getImg() {
            return this.img;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final int getVersionCode() {
            return this.versionCode;
        }

        public final boolean isSplitApk() {
            return this.isSplitApk;
        }

        public final boolean isSupported() {
            return this.isSupported;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setImg(byte[] bArr) {
            js3.p(bArr, "<set-?>");
            this.img = bArr;
        }

        public final void setName(String str) {
            js3.p(str, "<set-?>");
            this.name = str;
        }

        public final void setPackageName(String str) {
            js3.p(str, "<set-?>");
            this.packageName = str;
        }

        public final void setSplitApk(boolean z) {
            this.isSplitApk = z;
        }

        public final void setSupported(boolean z) {
            this.isSupported = z;
        }

        public final void setVersionCode(int i) {
            this.versionCode = i;
        }

        public /* synthetic */ AppInfo(long j, String str, int i, String str2, byte[] bArr, boolean z, boolean z2, int i2, yd1 yd1Var) {
            this(j, str, i, str2, bArr, z, (i2 & 64) != 0 ? true : z2);
        }
    }
}
