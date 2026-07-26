package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.RatingCompat;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import io.sentry.android.core.t0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r44 {
    public static final ImmutableSet a = ImmutableSet.s("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");

    public static long a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, long j) {
        long j2 = playbackStateCompat == null ? 0L : playbackStateCompat.c;
        long jC = c(playbackStateCompat, mediaMetadataCompat, j);
        long jD = d(mediaMetadataCompat);
        return jD == -9223372036854775807L ? Math.max(jC, j2) : j29.j(j2, jC, jD);
    }

    public static byte[] b(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, long j) {
        if (playbackStateCompat == null) {
            return 0L;
        }
        long jMax = playbackStateCompat.b;
        if (playbackStateCompat.a == 3) {
            jMax = Math.max(0L, jMax + ((long) (playbackStateCompat.d * ((j == -9223372036854775807L ? null : Long.valueOf(j)) != null ? r4.longValue() : SystemClock.elapsedRealtime() - playbackStateCompat.h))));
        }
        long j2 = jMax;
        long jD = d(mediaMetadataCompat);
        return jD == -9223372036854775807L ? Math.max(0L, j2) : j29.j(j2, 0L, jD);
    }

    public static long d(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null || !mediaMetadataCompat.a.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(rm7.n(i, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.session.legacy.MediaDescriptionCompat g(defpackage.jp4 r16, android.graphics.Bitmap r17) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r44.g(jp4, android.graphics.Bitmap):androidx.media3.session.legacy.MediaDescriptionCompat");
    }

    public static jp4 h(MediaDescriptionCompat mediaDescriptionCompat) {
        mediaDescriptionCompat.getClass();
        String str = mediaDescriptionCompat.a;
        yo4 yo4Var = new yo4();
        ImmutableMap.l();
        ImmutableList.q();
        List list = Collections.EMPTY_LIST;
        ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        pa2 pa2Var = new pa2(16, false);
        pa2Var.c = mediaDescriptionCompat.h;
        gp4 gp4Var2 = new gp4(pa2Var);
        qp4 qp4VarJ = j(mediaDescriptionCompat, 0);
        ap4 ap4Var = new ap4(yo4Var);
        ep4 ep4Var = new ep4(dp4Var);
        if (qp4VarJ == null) {
            qp4VarJ = qp4.K;
        }
        return new jp4(str2, ap4Var, null, ep4Var, qp4VarJ, gp4Var2);
    }

    public static jp4 i(String str, MediaMetadataCompat mediaMetadataCompat, int i) {
        gp4 gp4Var;
        yo4 yo4Var = new yo4();
        ImmutableMap.l();
        ImmutableList.q();
        List list = Collections.EMPTY_LIST;
        ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var2 = gp4.d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = mediaMetadataCompat.a.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            pa2 pa2Var = new pa2(16, false);
            pa2Var.c = Uri.parse(string);
            gp4Var = new gp4(pa2Var);
        } else {
            gp4Var = gp4Var2;
        }
        qp4 qp4VarK = k(mediaMetadataCompat, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ap4 ap4Var = new ap4(yo4Var);
        ep4 ep4Var = new ep4(dp4Var);
        if (qp4VarK == null) {
            qp4VarK = qp4.K;
        }
        return new jp4(str2, ap4Var, null, ep4Var, qp4VarK, gp4Var);
    }

    public static qp4 j(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        RatingCompat ratingCompat;
        byte[] bArrB;
        if (mediaDescriptionCompat == null) {
            return qp4.K;
        }
        CharSequence charSequence = mediaDescriptionCompat.b;
        pp4 pp4Var = new pp4();
        pp4Var.f = mediaDescriptionCompat.c;
        pp4Var.g = mediaDescriptionCompat.d;
        pp4Var.m = mediaDescriptionCompat.f;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ratingCompat = new RatingCompat(i, -1.0f);
                break;
            default:
                ratingCompat = null;
                break;
        }
        pp4Var.i = o(ratingCompat);
        Bitmap bitmap = mediaDescriptionCompat.e;
        if (bitmap != null) {
            try {
                bArrB = b(bitmap);
            } catch (IOException e) {
                wn5.l0("LegacyConversions", "Failed to convert iconBitmap to artworkData", e);
                bArrB = null;
            }
            pp4Var.b(bArrB, 3);
        }
        Bundle bundle = mediaDescriptionCompat.g;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            pp4Var.p = Integer.valueOf(f(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        pp4Var.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            pp4Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            pp4Var.I = ImmutableList.n(ImmutableList.n(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            pp4Var.a = charSequence;
        } else {
            pp4Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            pp4Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            pp4Var.H = bundle2;
        }
        pp4Var.r = Boolean.TRUE;
        return new qp4(pp4Var);
    }

    public static qp4 k(MediaMetadataCompat mediaMetadataCompat, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        RatingCompat ratingCompatA;
        RatingCompat ratingCompatA2;
        RatingCompat ratingCompat;
        String string;
        if (mediaMetadataCompat == null) {
            return qp4.K;
        }
        Bundle bundle = mediaMetadataCompat.a;
        pp4 pp4Var = new pp4();
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        int i2 = 0;
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr = MediaMetadataCompat.d;
                if (i4 >= strArr.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i4]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i3] = charSequence4;
                    i3++;
                }
                i4 = i5;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.TITLE");
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        pp4Var.a = charSequence7;
        pp4Var.e = charSequence3;
        pp4Var.f = charSequence2;
        pp4Var.g = charSequence;
        pp4Var.b = bundle.getCharSequence("android.media.metadata.ARTIST");
        pp4Var.c = bundle.getCharSequence("android.media.metadata.ALBUM");
        pp4Var.d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        Bitmap bitmap = null;
        try {
            ratingCompatA = RatingCompat.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e) {
            t0.n("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            ratingCompatA = null;
        }
        pp4Var.j = o(ratingCompatA);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
            if (jA >= 0) {
                pp4Var.c(Long.valueOf(jA));
            }
        }
        try {
            ratingCompatA2 = RatingCompat.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception e2) {
            t0.n("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            ratingCompatA2 = null;
        }
        fv6 fv6VarO = o(ratingCompatA2);
        if (fv6VarO != null) {
            pp4Var.i = fv6VarO;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ratingCompat = new RatingCompat(i, -1.0f);
                    break;
                default:
                    ratingCompat = null;
                    break;
            }
            pp4Var.i = o(ratingCompat);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            pp4Var.s = Integer.valueOf((int) mediaMetadataCompat.a("android.media.metadata.YEAR"));
        }
        String[] strArr2 = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        int i6 = 0;
        while (true) {
            if (i6 < 3) {
                String str = strArr2[i6];
                if (bundle.containsKey(str)) {
                    CharSequence charSequence8 = bundle.getCharSequence(str);
                    if (charSequence8 != null) {
                        string = charSequence8.toString();
                    }
                } else {
                    i6++;
                }
            }
        }
        string = null;
        if (string != null) {
            pp4Var.m = Uri.parse(string);
        }
        String[] strArr3 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        while (true) {
            if (i2 < 3) {
                String str2 = strArr3[i2];
                if (bundle.containsKey(str2)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str2);
                    } catch (Exception e3) {
                        t0.n("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                pp4Var.b(b(bitmap), 3);
            } catch (IOException e4) {
                wn5.l0("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e4);
            }
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        pp4Var.q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            pp4Var.p = Integer.valueOf(f(mediaMetadataCompat.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            pp4Var.G = Integer.valueOf((int) mediaMetadataCompat.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        pp4Var.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        zx8 it = a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            pp4Var.H = bundle2;
        }
        return new qp4(pp4Var);
    }

    public static MediaMetadataCompat l(qp4 qp4Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        ck4 ck4Var = new ck4(2);
        ck4Var.x("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = qp4Var.a;
        Bundle bundle = qp4Var.I;
        Integer num = qp4Var.p;
        Uri uri2 = qp4Var.m;
        if (charSequence != null) {
            ck4Var.y(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = qp4Var.e;
        if (charSequence2 != null) {
            ck4Var.y(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = qp4Var.f;
        if (charSequence3 != null) {
            ck4Var.y(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = qp4Var.g;
        if (charSequence4 != null) {
            ck4Var.y(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = qp4Var.b;
        if (charSequence5 != null) {
            ck4Var.y(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = qp4Var.c;
        if (charSequence6 != null) {
            ck4Var.y(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = qp4Var.d;
        if (charSequence7 != null) {
            ck4Var.y(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (qp4Var.t != null) {
            ck4Var.v(r7.intValue(), "android.media.metadata.YEAR");
        }
        if (uri != null) {
            ck4Var.x("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            ck4Var.x("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            ck4Var.x("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            ck4Var.x("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            ck4Var.u("android.media.metadata.DISPLAY_ICON", bitmap);
            ck4Var.u("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            ck4Var.v(e(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = qp4Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        ck4Var.v(j, "android.media.metadata.DURATION");
        RatingCompat ratingCompatP = p(qp4Var.i);
        if (ratingCompatP != null) {
            ck4Var.w("android.media.metadata.USER_RATING", ratingCompatP);
        }
        RatingCompat ratingCompatP2 = p(qp4Var.j);
        if (ratingCompatP2 != null) {
            ck4Var.w("android.media.metadata.RATING", ratingCompatP2);
        }
        if (qp4Var.H != null) {
            ck4Var.v(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    ck4Var.y((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    ck4Var.v(((Number) obj).longValue(), str2);
                }
            }
        }
        return new MediaMetadataCompat((Bundle) ck4Var.b);
    }

    public static PlaybackException m(PlaybackStateCompat playbackStateCompat, Context context) {
        if (playbackStateCompat != null) {
            int i = playbackStateCompat.f;
            if (playbackStateCompat.a == 7) {
                CharSequence charSequenceW = playbackStateCompat.g;
                if (charSequenceW == null) {
                    charSequenceW = w(context, r(i));
                }
                Bundle bundle = playbackStateCompat.k;
                String string = charSequenceW != null ? charSequenceW.toString() : null;
                int iR = r(i);
                if (iR == -5) {
                    iR = 2000;
                } else if (iR == -1) {
                    iR = 1000;
                }
                int i2 = iR;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new PlaybackException(string, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                wn5.k0("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static fv6 o(RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        float f = ratingCompat.b;
        int i = ratingCompat.a;
        switch (i) {
            case 1:
                if (ratingCompat.c()) {
                    return new ly2(i == 1 && f == 1.0f);
                }
                return new ly2();
            case 2:
                if (ratingCompat.c()) {
                    return new fl8(i == 2 && f == 1.0f);
                }
                return new fl8();
            case 3:
                return ratingCompat.c() ? new o48(3, ratingCompat.b()) : new o48(3);
            case 4:
                return ratingCompat.c() ? new o48(4, ratingCompat.b()) : new o48(4);
            case 5:
                return ratingCompat.c() ? new o48(5, ratingCompat.b()) : new o48(5);
            case 6:
                if (!ratingCompat.c()) {
                    return new w46();
                }
                if (i != 6 || !ratingCompat.c()) {
                    f = -1.0f;
                }
                return new w46(f);
            default:
                return null;
        }
    }

    public static RatingCompat p(fv6 fv6Var) {
        if (fv6Var != null) {
            int iV = v(fv6Var);
            if (!fv6Var.b()) {
                switch (iV) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new RatingCompat(iV, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iV) {
                case 1:
                    return new RatingCompat(1, ((ly2) fv6Var).c ? 1.0f : 0.0f);
                case 2:
                    return new RatingCompat(2, ((fl8) fv6Var).c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return RatingCompat.e(iV, ((o48) fv6Var).c);
                case 6:
                    return RatingCompat.d(((w46) fv6Var).b);
            }
        }
        return null;
    }

    public static int q(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                wn5.k0("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int r(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean s(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(rm7.n(i, "Unrecognized ShuffleMode: "));
    }

    public static void t(n94 n94Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    n94Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - jElapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int u(ly lyVar) {
        qm5 nyVar = Build.VERSION.SDK_INT >= 26 ? new ny(8) : new qm5(8);
        AudioAttributes.Builder builder = (AudioAttributes.Builder) nyVar.b;
        builder.setContentType(lyVar.a);
        builder.setFlags(lyVar.b);
        nyVar.u(lyVar.c);
        my myVarB = nyVar.b();
        AudioAttributes audioAttributes = myVarB.a;
        int i = myVarB.b;
        if (i == -1) {
            audioAttributes.getClass();
            int flags = audioAttributes.getFlags();
            audioAttributes.getClass();
            int usage = audioAttributes.getUsage();
            if ((flags & 1) != 1) {
                if ((flags & 4) != 4) {
                    switch (usage) {
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 11:
                            i = 10;
                            break;
                        case 12:
                        default:
                            i = 3;
                            break;
                        case 13:
                            i = 1;
                            break;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
        }
        if (i == Integer.MIN_VALUE) {
            return 3;
        }
        return i;
    }

    public static int v(fv6 fv6Var) {
        if (fv6Var instanceof ly2) {
            return 1;
        }
        if (fv6Var instanceof fl8) {
            return 2;
        }
        if (!(fv6Var instanceof o48)) {
            return fv6Var instanceof w46 ? 6 : 0;
        }
        int i = ((o48) fv6Var).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static String w(Context context, int i) {
        if (i == -100) {
            return context.getString(at6.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(at6.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(at6.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(at6.error_message_io);
        }
        if (i == -4) {
            return context.getString(at6.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(at6.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(at6.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(at6.error_message_content_already_playing);
            case -109:
                return context.getString(at6.error_message_end_of_playlist);
            case -108:
                return context.getString(at6.error_message_setup_required);
            case -107:
                return context.getString(at6.error_message_skip_limit_reached);
            case -106:
                return context.getString(at6.error_message_not_available_in_region);
            case -105:
                return context.getString(at6.error_message_parental_control_restricted);
            case -104:
                return context.getString(at6.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(at6.error_message_premium_account_required);
            case -102:
                return context.getString(at6.error_message_authentication_expired);
            default:
                return context.getString(at6.error_message_fallback);
        }
    }

    public static boolean x(long j, long j2) {
        return (j & j2) != 0;
    }
}
