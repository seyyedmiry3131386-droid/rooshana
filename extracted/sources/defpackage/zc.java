package defpackage;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.compose.ui.contentcapture.b;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public abstract class zc {
    public static boolean a(AlarmManager alarmManager) {
        return alarmManager.canScheduleExactAlarms();
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect c(float f, float f2) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, Shader.TileMode.CLAMP);
    }

    public static void d(Context context, fn5 fn5Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PaymentRequiredBindingDto.BINDING_PHONE);
            telephonyManager.getClass();
            dn5 dn5Var = new dn5(fn5Var);
            telephonyManager.registerTelephonyCallback((Executor) fn5Var.c, dn5Var);
            telephonyManager.unregisterTelephonyCallback(dn5Var);
        } catch (RuntimeException unused) {
            fn5Var.c(5);
        }
    }

    public static void e(b bVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        ln7 ln7Var;
        c cVar;
        e3 e3Var;
        dp2 dp2Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (ln7Var = (ln7) bVar.d().b((int) jKeyAt)) != null && (cVar = ln7Var.a) != null && (e3Var = (e3) androidx.compose.ui.semantics.b.a(cVar.d, a.l)) != null && (dp2Var = (dp2) e3Var.b) != null) {
            }
        }
    }

    public static void f(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void g(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void h(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static Path i(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float j(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static hz k(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return hz.d;
        }
        gz gzVar = new gz();
        boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        gzVar.a = true;
        gzVar.b = z2;
        gzVar.c = z;
        return gzVar.a();
    }

    public static boolean l(IllegalStateException illegalStateException) {
        return vj3.i(illegalStateException);
    }

    public static boolean m(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    public static Typeface n(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, at2.S(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static void o(b bVar, long[] jArr, Consumer consumer) {
        c cVar;
        String strA;
        for (long j : jArr) {
            ln7 ln7Var = (ln7) bVar.d().b((int) j);
            if (ln7Var != null && (cVar = ln7Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(bVar.a.getAutofillId(), cVar.g);
                List list = (List) androidx.compose.ui.semantics.b.a(cVar.d, d.B);
                if (list != null && (strA = k94.a(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new ll(strA)));
                    consumer.n(builder.build());
                }
            }
        }
    }

    public static float p(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static boolean q(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static void r(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void s(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }

    public static void t(AudioTrack audioTrack, ee6 ee6Var) {
        LogSessionId logSessionIdA = ee6Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA);
    }

    public static void u(MediaDrm mediaDrm, byte[] bArr, ee6 ee6Var) {
        LogSessionId logSessionIdA = ee6Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdA);
    }

    public static void v(on onVar, ee6 ee6Var) {
        LogSessionId logSessionIdA = ee6Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) onVar.b).setString("log-session-id", logSessionIdA.getStringId());
    }

    public static void w(qq4 qq4Var, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((nq4) qq4Var.a).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            wn5.H("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    public static void x(RenderNode renderNode, id0 id0Var) {
        renderNode.setRenderEffect(id0Var != null ? id0Var.a() : null);
    }

    public static void y(View view, id0 id0Var) {
        view.setRenderEffect(id0Var != null ? id0Var.a() : null);
    }

    public static final String z(ej2 ej2Var, Context context) {
        ArrayList arrayList = ej2Var.a;
        uj1 uj1VarF = xq2.f(context);
        int i = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == 0) {
            return k94.a(arrayList, null, new sm5(uj1VarF), 31);
        }
        if (arrayList.size() > 0) {
            throw rm7.l(0, arrayList);
        }
        float fS = ok4.s(i + 400.0f, 1.0f, 1000.0f);
        return (!arrayList.isEmpty() ? "," : "") + "'wght' " + fS;
    }
}
