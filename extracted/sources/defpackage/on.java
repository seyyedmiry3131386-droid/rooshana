package defpackage;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.core.content.ContextCompat;
import androidx.media3.common.b;
import coil3.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j0;
import com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class on {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public on(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = cw7.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public static zd1 a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(rm7.n(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = j29.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new zd1(map);
    }

    public static void b(zd1 zd1Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = zd1Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean e(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList h(Context context, int i) {
        int iC = rk8.c(context, xp6.colorControlHighlight);
        return new ColorStateList(new int[][]{rk8.b, rk8.d, rk8.c, rk8.f}, new int[]{rk8.b(context, xp6.colorButtonNormal), sv0.c(iC, i), sv0.c(iC, i), i});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ks4 j(gb6 gb6Var, ImmutableList immutableList, ks4 ks4Var, yl8 yl8Var) {
        bm8 bm8VarS = gb6Var.S();
        int iP = gb6Var.p();
        Object objL = bm8VarS.p() ? null : bm8VarS.l(iP);
        int iB = (gb6Var.h() || bm8VarS.p()) ? -1 : bm8VarS.f(iP, yl8Var, false).b(j29.V(gb6Var.d0()) - yl8Var.e);
        for (int i = 0; i < immutableList.size(); i++) {
            ks4 ks4Var2 = (ks4) immutableList.get(i);
            if (q(ks4Var2, objL, gb6Var.h(), gb6Var.L(), gb6Var.u(), iB)) {
                return ks4Var2;
            }
        }
        if (immutableList.isEmpty() && ks4Var != null && q(ks4Var, objL, gb6Var.h(), gb6Var.L(), gb6Var.u(), iB)) {
            return ks4Var;
        }
        return null;
    }

    public static LayerDrawable n(u67 u67Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = u67Var.f(context, cr6.abc_star_black_48dp);
        Drawable drawableF2 = u67Var.f(context, cr6.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static boolean q(ks4 ks4Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = ks4Var.a;
        int i4 = ks4Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && ks4Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && ks4Var.e == i3;
    }

    public static void v(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = pn.b;
        }
        drawableMutate.setColorFilter(pn.c(i, mode));
    }

    public void c(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void d(j0 j0Var, ks4 ks4Var, bm8 bm8Var) {
        if (ks4Var == null) {
            return;
        }
        if (bm8Var.b(ks4Var.a) != -1) {
            j0Var.c(ks4Var, bm8Var);
            return;
        }
        bm8 bm8Var2 = (bm8) ((ImmutableMap) this.c).get(ks4Var);
        if (bm8Var2 != null) {
            j0Var.c(ks4Var, bm8Var2);
        }
    }

    public l20 f() {
        String strI = ((String) this.a) == null ? " transportName" : "";
        if (((o12) this.c) == null) {
            strI = strI.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strI = t61.i(strI, " eventMillis");
        }
        if (((Long) this.e) == null) {
            strI = t61.i(strI, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strI = t61.i(strI, " autoMetadata");
        }
        if (strI.isEmpty()) {
            return new l20((String) this.a, (Integer) this.b, (o12) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public a g() {
        Context context = (Context) this.a;
        ni3 ni3Var = (ni3) this.b;
        z72 z72Var = (z72) this.f;
        z72Var.getClass();
        ni3 ni3VarA = ni3.a(ni3Var, new a82(hs9.V(z72Var.a)), 8191);
        c24 c24VarA = kotlin.a.a(new qq1(9));
        c24 c24VarA2 = (InitializedLazyImpl) this.c;
        if (c24VarA2 == null) {
            c24VarA2 = kotlin.a.a(new x2(29, this));
        }
        c24 c24VarA3 = (InitializedLazyImpl) this.d;
        if (c24VarA3 == null) {
            c24VarA3 = kotlin.a.a(new qq1(10));
        }
        oy0 oy0Var = (oy0) this.e;
        if (oy0Var == null) {
            EmptyList emptyList = EmptyList.a;
            oy0Var = new oy0(emptyList, emptyList, emptyList, emptyList, emptyList);
        }
        return new a(new bw6(context, ni3VarA, c24VarA, c24VarA2, c24VarA3, oy0Var));
    }

    public ox9 i(ox9 ox9Var) {
        return ox9Var.j(new qa(0), new vv1(24, this));
    }

    public void k() {
        Messenger messenger;
        nl4 nl4Var = ((rl4) this.f).a;
        hh2 hh2Var = nl4Var.f;
        if (hh2Var != null && (messenger = nl4Var.g) != null) {
            try {
                hh2Var.E(7, null, messenger);
            } catch (RemoteException unused) {
            }
        }
        nl4Var.b.disconnect();
        ((BroadcastReceiver.PendingResult) this.e).finish();
    }

    public vk0 l(String str) {
        return (vk0) ((HashMap) this.a).get(str);
    }

    public vk0 m(String str) {
        HashMap map = (HashMap) this.a;
        vk0 vk0Var = (vk0) map.get(str);
        if (vk0Var != null) {
            return vk0Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        vk0 vk0Var2 = new vk0(iKeyAt, str, zd1.c);
        map.put(str, vk0Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((wk0) this.e).e(vk0Var2);
        return vk0Var2;
    }

    public ColorStateList o(Context context, int i) {
        if (i == cr6.abc_edit_text_material) {
            return ContextCompat.getColorStateList(context, gq6.abc_tint_edittext);
        }
        if (i == cr6.abc_switch_track_mtrl_alpha) {
            return ContextCompat.getColorStateList(context, gq6.abc_tint_switch_track);
        }
        if (i != cr6.abc_switch_thumb_material) {
            if (i == cr6.abc_btn_default_mtrl_shape) {
                return h(context, rk8.c(context, xp6.colorButtonNormal));
            }
            if (i == cr6.abc_btn_borderless_material) {
                return h(context, 0);
            }
            if (i == cr6.abc_btn_colored_material) {
                return h(context, rk8.c(context, xp6.colorAccent));
            }
            if (i == cr6.abc_spinner_mtrl_am_alpha || i == cr6.abc_spinner_textfield_background_material) {
                return ContextCompat.getColorStateList(context, gq6.abc_tint_spinner);
            }
            if (e((int[]) this.b, i)) {
                return rk8.d(context, xp6.colorControlNormal);
            }
            if (e((int[]) this.e, i)) {
                return ContextCompat.getColorStateList(context, gq6.abc_tint_default);
            }
            if (e((int[]) this.f, i)) {
                return ContextCompat.getColorStateList(context, gq6.abc_tint_btn_checkable);
            }
            if (i == cr6.abc_seekbar_thumb_material) {
                return ContextCompat.getColorStateList(context, gq6.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = rk8.d(context, xp6.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = rk8.b;
            iArr2[0] = rk8.b(context, xp6.colorSwitchThumbNormal);
            iArr[1] = rk8.e;
            iArr2[1] = rk8.c(context, xp6.colorControlActivated);
            iArr[2] = rk8.f;
            iArr2[2] = rk8.c(context, xp6.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = rk8.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = rk8.e;
            iArr2[1] = rk8.c(context, xp6.colorControlActivated);
            iArr[2] = rk8.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void p(long j) {
        wk0 wk0Var;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        wk0 wk0Var2 = (wk0) this.e;
        wk0Var2.h(j);
        wk0 wk0Var3 = (wk0) this.f;
        if (wk0Var3 != null) {
            wk0Var3.h(j);
        }
        if (wk0Var2.f() || (wk0Var = (wk0) this.f) == null || !wk0Var.f()) {
            wk0Var2.i(map, sparseArray);
        } else {
            ((wk0) this.f).i(map, sparseArray);
            wk0Var2.a(map);
        }
        wk0 wk0Var4 = (wk0) this.f;
        if (wk0Var4 != null) {
            wk0Var4.k();
            this.f = null;
        }
    }

    public jo3 r() throws IOException {
        k96 k96Var = k96.a;
        Object obj = k96.a;
        y41 y41Var = obj != null ? (y41) obj : null;
        Context contextB = y41Var != null ? y41Var.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open((String) this.f);
        js3.o(inputStreamOpen, "open(...)");
        return rf0.L(inputStreamOpen);
    }

    public void s(String str) {
        SparseArray sparseArray = (SparseArray) this.b;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        vk0 vk0Var = (vk0) map.get(str);
        if (vk0Var != null && vk0Var.c.isEmpty() && vk0Var.d.isEmpty()) {
            map.remove(str);
            int i = vk0Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((wk0) this.e).b(vk0Var, z);
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public void t() {
        try {
            tv6 tv6VarJ = rf0.j(r());
            try {
                ByteString byteStringV = tv6VarJ.v(tv6VarJ.readInt());
                ByteString byteStringV2 = tv6VarJ.v(tv6VarJ.readInt());
                tv6VarJ.close();
                synchronized (this) {
                    js3.m(byteStringV);
                    this.c = byteStringV;
                    js3.m(byteStringV2);
                    this.d = byteStringV2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.b).countDown();
        }
    }

    public void u(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        HeartBeatInfo$HeartBeat heartBeatInfo$HeartBeatA;
        PackageInfo packageInfoE;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        xc2 xc2Var = (xc2) this.a;
        xc2Var.a();
        bundle.putString("gmp_app_id", xc2Var.c.b);
        z21 z21Var = (z21) this.b;
        synchronized (z21Var) {
            try {
                if (z21Var.a == 0 && (packageInfoE = z21Var.e("com.google.android.gms")) != null) {
                    z21Var.a = packageInfoE.versionCode;
                }
                i = z21Var.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((z21) this.b).b());
        bundle.putString("app_ver_name", ((z21) this.b).c());
        xc2 xc2Var2 = (xc2) this.a;
        xc2Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(xc2Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((p20) z67.a(((com.google.firebase.installations.a) ((ad2) this.f)).e())).a;
            if (TextUtils.isEmpty(str3)) {
                t0.m("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e) {
            e = e;
            t0.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            t0.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) z67.a(((com.google.firebase.installations.a) ((ad2) this.f)).d()));
        bundle.putString("cliv", "fcm-25.0.1");
        jy2 jy2Var = (jy2) ((qn6) this.e).get();
        ei1 ei1Var = (ei1) ((qn6) this.d).get();
        if (jy2Var == null || ei1Var == null || (heartBeatInfo$HeartBeatA = ((we1) jy2Var).a()) == HeartBeatInfo$HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatInfo$HeartBeatA.a));
        bundle.putString("Firebase-Client", ei1Var.a());
    }

    public ox9 w(String str, String str2, Bundle bundle) {
        int i;
        try {
            u(str, str2, bundle);
            fb7 fb7Var = (fb7) this.c;
            ko9 ko9Var = ko9.c;
            xr5 xr5Var = fb7Var.c;
            if (xr5Var.v() >= 12000000) {
                jx9 jx9VarZ = jx9.z(fb7Var.b);
                synchronized (jx9VarZ) {
                    i = jx9VarZ.a;
                    jx9VarZ.a = i + 1;
                }
                return jx9VarZ.A(new kw9(i, 1, bundle, 1)).j(ko9Var, hy2.w);
            }
            if (xr5Var.w() != 0) {
                return fb7Var.a(bundle).k(ko9Var, new rn6(fb7Var, bundle, 27));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            ox9 ox9Var = new ox9();
            ox9Var.n(iOException);
            return ox9Var;
        } catch (InterruptedException | ExecutionException e) {
            ox9 ox9Var2 = new ox9();
            ox9Var2.n(e);
            return ox9Var2;
        }
    }

    public void x() {
        ((wk0) this.e).g((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y(bm8 bm8Var) {
        j0 j0VarA = ImmutableMap.a();
        if (((ImmutableList) this.b).isEmpty()) {
            d(j0VarA, (ks4) this.e, bm8Var);
            if (!Objects.equals((ks4) this.f, (ks4) this.e)) {
                d(j0VarA, (ks4) this.f, bm8Var);
            }
            if (!Objects.equals((ks4) this.d, (ks4) this.e) && !Objects.equals((ks4) this.d, (ks4) this.f)) {
                d(j0VarA, (ks4) this.d, bm8Var);
            }
        } else {
            for (int i = 0; i < ((ImmutableList) this.b).size(); i++) {
                d(j0VarA, (ks4) ((ImmutableList) this.b).get(i), bm8Var);
            }
            if (!((ImmutableList) this.b).contains((ks4) this.d)) {
                d(j0VarA, (ks4) this.d, bm8Var);
            }
        }
        this.c = j0VarA.a(true);
    }

    public on(int i) {
        switch (i) {
            case 1:
                this.a = new AtomicBoolean(false);
                this.b = new CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            case 11:
                this.a = he6.F.i(dp6.g);
                this.b = xp7.b;
                this.c = cb6.b;
                this.d = ImmutableList.q();
                this.e = Bundle.EMPTY;
                this.f = null;
                break;
            default:
                this.a = new int[]{cr6.abc_textfield_search_default_mtrl_alpha, cr6.abc_textfield_default_mtrl_alpha, cr6.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{cr6.abc_ic_commit_search_api_mtrl_alpha, cr6.abc_seekbar_tick_mark_material, cr6.abc_ic_menu_share_mtrl_alpha, cr6.abc_ic_menu_copy_mtrl_am_alpha, cr6.abc_ic_menu_cut_mtrl_alpha, cr6.abc_ic_menu_selectall_mtrl_alpha, cr6.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{cr6.abc_textfield_activated_mtrl_alpha, cr6.abc_textfield_search_activated_mtrl_alpha, cr6.abc_cab_background_top_mtrl_alpha, cr6.abc_text_cursor_material, cr6.abc_text_select_handle_left_mtrl, cr6.abc_text_select_handle_middle_mtrl, cr6.abc_text_select_handle_right_mtrl};
                this.d = new int[]{cr6.abc_popup_background_mtrl_mult, cr6.abc_cab_background_internal_bg, cr6.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{cr6.abc_tab_indicator_material, cr6.abc_textfield_search_material};
                this.f = new int[]{cr6.abc_btn_check_material, cr6.abc_btn_radio_material, cr6.abc_btn_check_material_anim, cr6.abc_btn_radio_material_anim};
                break;
        }
    }

    public on(Context context) {
        this.a = context.getApplicationContext();
        this.b = ni3.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = new z72();
    }

    public on(sm4 sm4Var, MediaFormat mediaFormat, b bVar, Surface surface, MediaCrypto mediaCrypto, gg4 gg4Var) {
        this.a = sm4Var;
        this.b = mediaFormat;
        this.c = bVar;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = gg4Var;
    }

    public on(he6 he6Var, xp7 xp7Var, cb6 cb6Var, ImmutableList immutableList, Bundle bundle, yp7 yp7Var) {
        this.a = he6Var;
        this.b = xp7Var;
        this.c = cb6Var;
        this.d = immutableList;
        this.e = bundle == null ? Bundle.EMPTY : bundle;
        this.f = yp7Var;
    }
}
