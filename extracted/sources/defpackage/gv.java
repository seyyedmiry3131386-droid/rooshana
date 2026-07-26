package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.firebase.components.ComponentRegistrar;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class gv implements hv, pc0, tj0, v61, j89, yo1, xt1, wa1, w67, ys2 {
    public final /* synthetic */ int a;

    public /* synthetic */ gv(int i) {
        this.a = i;
    }

    public static String n(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static byte[] r(ImmutableList immutableList, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            l81 l81Var = (l81) it.next();
            Bundle bundleC = l81Var.c();
            Bitmap bitmap = l81Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                vy2.s(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(l81.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME, arrayList);
        bundle.putLong(ByteArrayResult.AppInfo.NAME_SERIALISED_NAME, j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static zf1 s(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new zf1(httpURLConnection);
    }

    @Override // defpackage.pc0
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.tj0, defpackage.uj0
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.ys2
    public w57 build() {
        return new w57();
    }

    @Override // defpackage.pc0
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.pc0
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.w67
    public g67 f(g67 g67Var, sv5 sv5Var) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((us2) ((ns2) g67Var.get()).a.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = lj0.a;
        e39 e39Var = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new e39(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (e39Var != null && e39Var.a == 0 && e39Var.b == e39Var.c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new vj0(bArrArray);
    }

    @Override // defpackage.yo1
    public File h(sx3 sx3Var) {
        return null;
    }

    @Override // defpackage.wa1
    public xa1 k() {
        return new eb2(false);
    }

    @Override // defpackage.hv
    public void o(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        jv.b(iArr, iArr2, false);
    }

    public List p(Executor executor) {
        return Collections.singletonList(new wd1(executor));
    }

    public List q() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.qq5 t(com.google.gson.reflect.TypeToken r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv.t(com.google.gson.reflect.TypeToken, boolean):qq5");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Top";
            case 8:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    public List u(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (tx0 tx0Var : componentRegistrar.getComponents()) {
            String str = tx0Var.a;
            if (str != null) {
                tx0Var = new tx0(str, tx0Var.b, tx0Var.c, tx0Var.d, tx0Var.e, new j2(str, tx0Var, 4), tx0Var.g);
            }
            arrayList.add(tx0Var);
        }
        return arrayList;
    }

    @Override // defpackage.xt1
    public void g() {
    }

    @Override // defpackage.pc0
    public void l() {
    }

    @Override // defpackage.pc0
    public void j(int i) {
    }

    @Override // defpackage.xt1
    public void i(pc0 pc0Var, Bitmap bitmap) {
    }

    @Override // defpackage.yo1
    public void m(sx3 sx3Var, wv8 wv8Var) {
    }
}
