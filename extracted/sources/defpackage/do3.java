package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.d;
import coil3.compose.AsyncImagePainter;
import defpackage.g16;
import defpackage.js3;
import ir.mservices.market.version2.webapi.requestdto.AuthorizeRequestDto;
import ir.mservices.market.version2.webapi.responsedto.AuthorizationDTO;
import ir.myket.auth.domain.models.AuthData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public class do3 implements gb8, we8, nb7, oc0, zk0, fl0, wa1, j02, c18 {
    public static final int[] c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final Object d = new Object();
    public static jg9 e;
    public Object a;
    public Object b;

    public /* synthetic */ do3(Object obj) {
        this.a = obj;
    }

    public static ox9 m(Context context, Intent intent, boolean z) {
        jg9 jg9Var;
        synchronized (d) {
            try {
                if (e == null) {
                    e = new jg9(context);
                }
                jg9Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return jg9Var.b(intent).j(new qa(0), new vv1(14));
        }
        if (vp7.T().a0(context)) {
            jc9.c(context, jg9Var, intent);
        } else {
            jg9Var.b(intent);
        }
        return z67.g(-1);
    }

    public void A(String str) {
        ap1 ap1Var;
        synchronized (this) {
            try {
                ap1Var = (ap1) ((HashMap) this.a).get(str);
                ok4.p(ap1Var, "Argument must not be null");
                int i = ap1Var.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + ap1Var.b);
                }
                int i2 = i - 1;
                ap1Var.b = i2;
                if (i2 == 0) {
                    ap1 ap1Var2 = (ap1) ((HashMap) this.a).remove(str);
                    if (!ap1Var2.equals(ap1Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + ap1Var + ", but actually removed: " + ap1Var2 + ", safeKey: " + str);
                    }
                    ((r79) this.b).s(ap1Var2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ap1Var.a.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object B(defpackage.lf7 r18, defpackage.ry0 r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do3.B(lf7, ry0, boolean):java.lang.Object");
    }

    public void C(Object obj) {
        l lVar = (l) this.a;
        Pair pair = new Pair(Integer.valueOf(((Number) ((Pair) lVar.getValue()).a).intValue() + 1), obj);
        lVar.getClass();
        lVar.p(null, pair);
    }

    public void D(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.b;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public yx E() throws IOException {
        File file = (File) this.b;
        File file2 = (File) this.a;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                wn5.k0("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new yx(file2);
        } catch (FileNotFoundException e2) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e2);
            }
            try {
                return new yx(file2);
            } catch (FileNotFoundException e3) {
                throw new IOException("Couldn't create " + file2, e3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable F(Drawable drawable, boolean z) {
        if (drawable instanceof pg9) {
            ((qg9) ((pg9) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = F(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.b) == null) {
                    this.b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public void G(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.a;
        Object parent = view.getParent();
        if (parent instanceof View) {
            G((View) parent, fArr);
            dp2 dp2Var = d.a;
            pk4.d(fArr2);
            pk4.f(fArr2, -view.getScrollX(), -view.getScrollY());
            d.c(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            pk4.d(fArr2);
            pk4.f(fArr2, left, top);
            d.c(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.b;
            view.getLocationInWindow(iArr);
            dp2 dp2Var2 = d.a;
            pk4.d(fArr2);
            pk4.f(fArr2, -view.getScrollX(), -view.getScrollY());
            d.c(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            pk4.d(fArr2);
            pk4.f(fArr2, f, f2);
            d.c(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        bt2.T(matrix, fArr2);
        d.c(fArr, fArr2);
    }

    public void H() {
        synchronized (this) {
            ((AtomicInteger) this.a).decrementAndGet();
            if (((AtomicInteger) this.a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public uv5 I(uv5 uv5Var) {
        a82 a82Var;
        boolean z;
        a82 a82Var2 = uv5Var.j;
        zn5 zn5Var = si3.b;
        if (!fz.n((Bitmap.Config) gu9.r(uv5Var, zn5Var)) || ((ax2) this.b).n()) {
            a82Var = a82Var2;
            z = false;
        } else {
            a82Var2.getClass();
            LinkedHashMap linkedHashMapU = b.U(a82Var2.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapU.put(zn5Var, config);
            } else {
                linkedHashMapU.remove(zn5Var);
            }
            a82 a82Var3 = new a82(hs9.V(linkedHashMapU));
            z = true;
            a82Var = a82Var3;
        }
        return z ? new uv5(uv5Var.a, uv5Var.b, uv5Var.c, uv5Var.d, uv5Var.e, uv5Var.f, uv5Var.g, uv5Var.h, uv5Var.i, a82Var) : uv5Var;
    }

    @Override // defpackage.j02
    public Object a() {
        return (ey8) this.a;
    }

    @Override // defpackage.zk0
    public void b(View view, float[] fArr) {
        pk4.d(fArr);
        G(view, fArr);
    }

    @Override // defpackage.c18
    public t18 c() {
        return (m42) this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0075, B:33:0x0080, B:32:0x007b, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0075, B:33:0x0080, B:32:0x007b, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    @Override // defpackage.nb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.mb7 d(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do3.d(java.lang.String):mb7");
    }

    @Override // defpackage.we8
    public void e(wh3 wh3Var) {
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.b;
        final g16 g16VarD = wh3Var != null ? rq4.d(wh3Var, ((pi3) this.a).a, asyncImagePainter.o) : null;
        AsyncImagePainter.k(asyncImagePainter, new zw(g16VarD) { // from class: coil3.compose.AsyncImagePainter$State$Loading
            private final g16 painter;

            {
                this.painter = g16VarD;
            }

            @Override // defpackage.zw
            public final g16 a() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AsyncImagePainter$State$Loading) && js3.i(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
            }

            public final int hashCode() {
                g16 g16Var = this.painter;
                if (g16Var == null) {
                    return 0;
                }
                return g16Var.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        });
    }

    @Override // defpackage.oc0
    public n94 f(byte[] bArr) {
        byte[] bArr2;
        wv8 wv8Var = (wv8) this.b;
        if (wv8Var == null || (bArr2 = (byte[]) wv8Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            n94 n94VarF = ((ab1) this.a).f(bArr);
            this.b = new wv8(bArr, n94VarF);
            return n94VarF;
        }
        n94 n94Var = (n94) ((wv8) this.b).d;
        vy2.t(n94Var);
        return n94Var;
    }

    @Override // defpackage.j02
    public boolean g(CharSequence charSequence, int i, int i2, lv8 lv8Var) {
        if ((lv8Var.c & 4) > 0) {
            return true;
        }
        if (((ey8) this.a) == null) {
            this.a = new ey8(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((cv) this.b).getClass();
        ((ey8) this.a).setSpan(new mv8(lv8Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.nb7
    public boolean h() {
        return ((nb7) this.a).h();
    }

    @Override // defpackage.fl0
    public Type i() {
        return (Type) this.a;
    }

    @Override // defpackage.c18
    public by7 j() {
        return (l42) this.a;
    }

    @Override // defpackage.wa1
    public xa1 k() {
        return new ae1((Context) this.a, ((aj0) this.b).k());
    }

    public zh8 l(List list) {
        gz1 gz1Var;
        Exception e2;
        gz1 gz1Var2;
        try {
            int size = list.size();
            int i = 0;
            gz1Var = null;
            while (i < size) {
                try {
                    gz1Var2 = (gz1) list.get(i);
                } catch (Exception e3) {
                    e2 = e3;
                }
                try {
                    gz1Var2.a((jg0) this.b);
                    i++;
                    gz1Var = gz1Var2;
                } catch (Exception e4) {
                    e2 = e4;
                    gz1Var = gz1Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((aj0) ((jg0) this.b).f).i());
                    sb2.append(", composition=");
                    sb2.append(((jg0) this.b).c());
                    sb2.append(", selection=");
                    jg0 jg0Var = (jg0) this.b;
                    sb2.append((Object) zi8.j(uy6.b(jg0Var.b, jg0Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    a.s0(list, sb, "\n", new n(gz1Var, this), 60);
                    String string = sb.toString();
                    js3.o(string, "toString(...)");
                    throw new RuntimeException(string, e2);
                }
            }
            jg0 jg0Var2 = (jg0) this.b;
            jg0Var2.getClass();
            ll llVar = new ll(((aj0) jg0Var2.f).toString());
            jg0 jg0Var3 = (jg0) this.b;
            long jB = uy6.b(jg0Var3.b, jg0Var3.c);
            zi8 zi8Var = zi8.h(((zh8) this.a).b) ? null : new zi8(jB);
            zh8 zh8Var = new zh8(llVar, zi8Var != null ? zi8Var.a : uy6.b(zi8.f(jB), zi8.g(jB)), ((jg0) this.b).c());
            this.a = zh8Var;
            return zh8Var;
        } catch (Exception e5) {
            gz1Var = null;
            e2 = e5;
        }
    }

    @Override // defpackage.fl0
    public Object n(dl0 dl0Var) {
        Executor executor = (Executor) this.b;
        return executor == null ? dl0Var : new vd1(executor, dl0Var);
    }

    public boolean o() {
        synchronized (this) {
            if (((AtomicBoolean) this.b).get()) {
                return false;
            }
            ((AtomicInteger) this.a).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        AuthorizationDTO authorizationDTO = (AuthorizationDTO) obj;
        String token = authorizationDTO.getToken();
        lw.c(token, null);
        lw.c(authorizationDTO.getAccountId(), "Server does not send accountId!");
        sb7.p("MyketService", "Authorize success", "accountId: " + authorizationDTO.getAccountId() + ", token: " + token);
        o2 o2Var = (o2) this.b;
        o2Var.authorizationManager.b(token);
        o2Var.accountManager.h(authorizationDTO.getAccountId(), authorizationDTO.getAccountKey(), authorizationDTO.getPublicUserId());
        z4 z4Var = o2Var.accountManager.h;
        String publicUserId = authorizationDTO.getPublicUserId();
        z4Var.j = publicUserId;
        z4Var.i(publicUserId, lu7.s, true);
        AuthorizeRequestDto authorizeRequestDto = (AuthorizeRequestDto) this.a;
        authorizeRequestDto.setAcId(authorizationDTO.getAccountId());
        authorizeRequestDto.setAcKey(authorizationDTO.getAccountKey());
        o2Var.sharedPreferencesProxy.i(lu7.h0, authorizeRequestDto.getHash());
        hq7 hq7Var = o2Var.setAuthDataUseCase;
        String accountId = authorizationDTO.getAccountId();
        String accountKey = authorizationDTO.getAccountKey();
        new AuthData(token, accountId, accountKey, false);
        hq7Var.getClass();
        ir.myket.persistent.datasource.a aVar = ((a10) hq7Var.q).a.a;
        ir.myket.persistent.datasource.b bVar = aVar.b;
        ox3[] ox3VarArr = ir.myket.persistent.datasource.a.n;
        bVar.b(aVar, ox3VarArr[0], token);
        aVar.c.b(aVar, ox3VarArr[1], accountId);
        aVar.f.b(aVar, ox3VarArr[4], accountKey);
        aVar.g.b(aVar, ox3VarArr[5], Boolean.FALSE);
        o2.authorizeCount--;
        o2.authorizeInProgress = false;
        Iterator it = o2Var.requestProxy.c.iterator();
        while (it.hasNext()) {
            xv2 xv2Var = (xv2) it.next();
            if (!xv2Var.l()) {
                wv2 wv2Var = xv2Var.r;
                if (wv2Var != null) {
                    wv2Var.b = false;
                }
                x57 x57Var = o2Var.requestProxy;
                z57 z57Var = xv2Var.s;
                String str = z57Var.a;
                String str2 = z57Var.b;
                String str3 = z57Var.c;
                Map map = z57Var.d;
                if (map != null) {
                    map.put("accountId", o2Var.accountManager.a());
                }
                xv2 xv2Var2 = new xv2(xv2Var.b, new z57(str, str2, str3, map, z57Var.e, z57Var.f, z57Var.h), xv2Var.v, xv2Var.t, xv2Var.h, xv2Var.m, xv2Var.r, xv2Var.q, false);
                xv2Var2.p = o2Var.getHeaders(new HashMap());
                xv2Var2.w = xv2Var.w;
                x57Var.a.a(xv2Var2);
            }
            it.remove();
        }
        lw.f(null, "queue is not empty", o2Var.requestProxy.c.size() == 0);
    }

    public v72 p(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    constructorA = ((gd1) this.a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                    constructorA = null;
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (v72) constructorA.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public InputMethodManager q() {
        return (InputMethodManager) this.b.getValue();
    }

    public n94 r(qp4 qp4Var) {
        Uri uri;
        byte[] bArr = qp4Var.k;
        if (bArr != null) {
            return f(bArr);
        }
        Uri uri2 = qp4Var.m;
        if (uri2 == null) {
            return null;
        }
        wv8 wv8Var = (wv8) this.b;
        if (wv8Var != null && (uri = (Uri) wv8Var.c) != null && uri.equals(uri2)) {
            n94 n94Var = (n94) ((wv8) this.b).d;
            vy2.t(n94Var);
            return n94Var;
        }
        ab1 ab1Var = (ab1) this.a;
        n94 n94VarB = ((wx4) ab1Var.a).b(new za1(ab1Var, uri2, 1));
        this.b = new wv8(uri2, n94VarB);
        return n94VarB;
    }

    public void s(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.a;
        sk6 sk6VarD = sk6.D(absSeekBar.getContext(), attributeSet, c, i);
        Drawable drawableW = sk6VarD.w(0);
        if (drawableW != null) {
            if (drawableW instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableW;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableF = F(animationDrawable.getFrame(i2), true);
                    drawableF.setLevel(10000);
                    animationDrawable2.addFrame(drawableF, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableW = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableW);
        }
        Drawable drawableW2 = sk6VarD.w(1);
        if (drawableW2 != null) {
            absSeekBar.setProgressDrawable(F(drawableW2, false));
        }
        sk6VarD.G();
    }

    public void t() throws IOException {
        String str = (String) this.a;
        if (((FileChannel) this.b) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = io.sentry.config.a.k(new FileOutputStream(file), file).getChannel();
            this.b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.b = null;
            throw new IllegalStateException(o40.y("Unable to lock file: '", str, "'."), th);
        }
    }

    public void u(k6 k6Var) {
        o77 o77Var = (o77) this.a;
        ((ActionMode.Callback) o77Var.a).onDestroyActionMode(o77Var.n(k6Var));
        ln lnVar = (ln) this.b;
        if (lnVar.w != null) {
            lnVar.l.getDecorView().removeCallbacks(lnVar.x);
        }
        if (lnVar.v != null) {
            x89 x89Var = lnVar.y;
            if (x89Var != null) {
                x89Var.b();
            }
            x89 x89VarB = q69.b(lnVar.v);
            x89VarB.a(0.0f);
            lnVar.y = x89VarB;
            x89VarB.e(new bn(2, this));
        }
        lnVar.u = null;
        ViewGroup viewGroup = lnVar.B;
        WeakHashMap weakHashMap = q69.a;
        f69.c(viewGroup);
        lnVar.J();
    }

    public boolean v(k6 k6Var, Menu menu) {
        ViewGroup viewGroup = ((ln) this.b).B;
        WeakHashMap weakHashMap = q69.a;
        f69.c(viewGroup);
        o77 o77Var = (o77) this.a;
        ActionMode.Callback callback = (ActionMode.Callback) o77Var.a;
        xb8 xb8VarN = o77Var.n(k6Var);
        fw7 fw7Var = (fw7) o77Var.d;
        Menu ku4Var = (Menu) fw7Var.get(menu);
        if (ku4Var == null) {
            ku4Var = new ku4((Context) o77Var.b, (ot4) menu);
            fw7Var.put(menu, ku4Var);
        }
        return callback.onPrepareActionMode(xb8VarN, ku4Var);
    }

    public FileInputStream w() {
        File file = (File) this.a;
        File file2 = (File) this.b;
        if (file2.exists()) {
            file.delete();
            file2.renameTo(file);
        }
        return io.sentry.config.a.g(file, new FileInputStream(file));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 uv5, still in use, count: 3, list:
          (r1v0 uv5) from 0x0096: MOVE (r18v0 uv5) = (r1v0 uv5) (LINE:151)
          (r1v0 uv5) from 0x007b: MOVE (r18v3 uv5) = (r1v0 uv5) (LINE:124)
          (r1v0 uv5) from 0x0084: MOVE (r18v5 uv5) = (r1v0 uv5) (LINE:133)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public defpackage.uv5 x(defpackage.pi3 r20, defpackage.dy7 r21) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do3.x(pi3, dy7):uv5");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.fn5 y(defpackage.x47 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do3.y(x47):fn5");
    }

    public ox9 z(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.a;
        qa qaVar = (qa) this.b;
        boolean z = wn5.R() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? z67.c(qaVar, new za1(context, intent, 2)).k(qaVar, new pr(context, intent, z2)) : m(context, intent, z2);
    }

    public /* synthetic */ do3(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ do3(Object obj, Object obj2, boolean z) {
        this.a = obj;
        this.b = obj2;
    }

    public do3(Context context, int i) {
        switch (i) {
            case 21:
                aj0 aj0Var = new aj0(2, (byte) 0);
                this.a = context.getApplicationContext();
                this.b = aj0Var;
                break;
            default:
                this.a = context;
                this.b = new qa(0);
                break;
        }
    }

    public do3(View view) {
        this.a = view;
        this.b = kotlin.a.b(LazyThreadSafetyMode.c, new hk3(4, this));
    }

    public do3(xj1 xj1Var, nb7 nb7Var) {
        js3.p(nb7Var, "actual");
        this.b = xj1Var;
        this.a = nb7Var;
    }

    public do3(at2 at2Var) {
        aj0 aj0Var = new aj0(0, (byte) 0);
        this.a = at2Var;
        this.b = aj0Var;
    }

    public do3(int i) {
        switch (i) {
            case 17:
                l lVarB = ja1.b(new Pair(Integer.MIN_VALUE, null));
                this.a = lVarB;
                this.b = new h11(lVarB, 0);
                break;
            case 24:
                this.a = new HashMap();
                this.b = new r79();
                break;
            default:
                this.a = Choreographer.getInstance();
                this.b = Looper.myLooper();
                break;
        }
    }

    public do3(gd1 gd1Var) {
        this.a = gd1Var;
        this.b = new AtomicBoolean(false);
    }
}
