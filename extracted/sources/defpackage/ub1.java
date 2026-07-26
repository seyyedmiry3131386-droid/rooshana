package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import ir.mservices.market.movie.uri.data.AdInfo;
import ir.mservices.market.movie.uri.data.CreditsDto;
import ir.mservices.market.movie.uri.data.MovieCreditDto;
import ir.mservices.market.movie.uri.data.MovieUriDto;
import ir.mservices.market.movie.uri.data.PlayerConfigDto;
import ir.mservices.market.movie.uri.data.PlayerRecommendationDto;
import ir.mservices.market.movie.uri.data.RestrictionInfoButtonDto;
import ir.mservices.market.movie.uri.data.SampleWatchDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.movie.common.domain.models.Credits;
import ir.myket.movie.common.domain.models.MovieCredit;
import ir.myket.movie.common.domain.models.MovieUri;
import ir.myket.movie.common.domain.models.Orientation;
import ir.myket.movie.common.domain.models.PlayerConfig;
import ir.myket.movie.common.domain.models.RecommendationTime;
import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import ir.myket.movie.common.domain.models.SampleWatch;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.b;
import okio.SegmentedByteString;
import org.slf4j.Marker;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ub1 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ErrorDTO.CODE_ACCESS_DENIED, ErrorDTO.CODE_ACCESS_DENIED, 2048};
    public static final a b = new a(1896786296, new yf(13), false);
    public static final zn5 c = new zn5(Boolean.TRUE);
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static boolean A(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.rz5 B(defpackage.ao0 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = defpackage.ub1.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            rz5 r1 = new rz5
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub1.B(ao0):rz5");
    }

    public static void C(ao0 ao0Var, d3 d3Var) throws ParserException {
        int i2 = ao0Var.i(5);
        ao0Var.t(2);
        if (ao0Var.h()) {
            ao0Var.t(5);
        }
        if (i2 >= 7 && i2 <= 10) {
            ao0Var.s();
        }
        if (ao0Var.h()) {
            int i3 = ao0Var.i(3);
            if (d3Var.b == -1 && i2 >= 0 && i2 <= 15 && (i3 == 0 || i3 == 1)) {
                d3Var.b = i2;
            }
            if (ao0Var.h()) {
                N(ao0Var);
            }
        }
    }

    public static void D(ao0 ao0Var, d3 d3Var) throws ParserException {
        ao0Var.t(2);
        boolean zH = ao0Var.h();
        int i2 = ao0Var.i(8);
        for (int i3 = 0; i3 < i2; i3++) {
            ao0Var.t(2);
            if (ao0Var.h()) {
                ao0Var.t(5);
            }
            if (zH) {
                ao0Var.t(24);
            } else {
                if (ao0Var.h()) {
                    if (!ao0Var.h()) {
                        ao0Var.t(4);
                    }
                    d3Var.c = ao0Var.i(6) + 1;
                }
                ao0Var.t(4);
            }
        }
        if (ao0Var.h()) {
            ao0Var.t(3);
            if (ao0Var.h()) {
                N(ao0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long E(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub1.E(int, java.lang.String):long");
    }

    public static String F(String str) {
        if (str == null) {
            return str;
        }
        String str2 = m88.Z(str, Marker.ANY_NON_NULL_MARKER, false) ? str : null;
        if (str2 == null) {
            return str;
        }
        String strSubstring = str2.substring(1);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int G(Context context, int i2, int i3) {
        TypedValue typedValueG = yh0.G(context, i2);
        return (typedValueG == null || typedValueG.type != 16) ? i3 : typedValueG.data;
    }

    public static TimeInterpolator H(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!A(strValueOf, "cubic-bezier") && !A(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!A(strValueOf, "cubic-bezier")) {
            if (A(strValueOf, "path")) {
                return new PathInterpolator(wq2.p(dw1.l(strValueOf, 1, 5)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(w(strArrSplit, 0), w(strArrSplit, 1), w(strArrSplit, 2), w(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static final int I(SegmentedByteString segmentedByteString, int i2) {
        int i3;
        int[] iArr = segmentedByteString.f;
        int i4 = i2 + 1;
        int length = segmentedByteString.e.length;
        js3.p(iArr, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static void J(ViewGroup viewGroup, float f2) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof fk4) {
            ((fk4) background).r(f2);
        }
    }

    public static void K(View view, fk4 fk4Var) {
        pz1 pz1Var = fk4Var.b.c;
        if (pz1Var == null || !pz1Var.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        dk4 dk4Var = fk4Var.b;
        if (dk4Var.m != elevation) {
            dk4Var.m = elevation;
            fk4Var.D();
        }
    }

    public static void L(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof fk4) {
            K(viewGroup, (fk4) background);
        }
    }

    public static int M(char c2, int i2, int i3, CharSequence charSequence) {
        while (i2 < i3) {
            if (charSequence.charAt(i2) != c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static void N(ao0 ao0Var) throws ParserException {
        int i2 = ao0Var.i(6);
        if (i2 < 2 || i2 > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i2)));
        }
        ao0Var.t(i2 * 8);
    }

    public static int O(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final String P(g51 g51Var) {
        Object objA;
        if (g51Var instanceof qp1) {
            return ((qp1) g51Var).toString();
        }
        try {
            objA = g51Var + '@' + v(g51Var);
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = g51Var.getClass().getName() + '@' + v(g51Var);
        }
        return (String) objA;
    }

    public static final RestrictionInfo Q(ir.mservices.market.movie.uri.data.RestrictionInfo restrictionInfo) {
        js3.p(restrictionInfo, "<this>");
        String iconUrl = restrictionInfo.getIconUrl();
        String title = restrictionInfo.getTitle();
        String description = restrictionInfo.getDescription();
        RestrictionInfoButtonDto primaryButton = restrictionInfo.getPrimaryButton();
        RestrictionButton restrictionButton = primaryButton != null ? new RestrictionButton(primaryButton.getActionText(), primaryButton.getAction()) : null;
        RestrictionInfoButtonDto secondaryButton = restrictionInfo.getSecondaryButton();
        return new RestrictionInfo(iconUrl, title, description, restrictionButton, secondaryButton != null ? new RestrictionButton(secondaryButton.getActionText(), secondaryButton.getAction()) : null);
    }

    public static final MovieUri R(MovieUriDto movieUriDto) {
        pj3 pj3VarZ;
        Credits credits;
        boolean z;
        SampleWatch sampleWatch;
        Object next;
        RestrictionButton restrictionButton;
        js3.p(movieUriDto, "<this>");
        pj3 pj3VarZ2 = ml9.z(movieUriDto.getUrls());
        Boolean hasSubtitle = movieUriDto.getHasSubtitle();
        Boolean bool = Boolean.TRUE;
        boolean zI = js3.i(hasSubtitle, bool);
        Long openingCreditsTime = movieUriDto.getOpeningCreditsTime();
        PlayerConfigDto playerConfigDto = movieUriDto.getPlayerConfigDto();
        PlayerConfig playerConfig = new PlayerConfig(playerConfigDto != null ? playerConfigDto.getMinHeight() : Integer.MAX_VALUE, playerConfigDto != null ? playerConfigDto.getMinBitrate() : Integer.MAX_VALUE);
        boolean zI2 = js3.i(movieUriDto.getDowngradeQuality(), bool);
        ir.mservices.market.movie.uri.data.RestrictionInfo restrictionInfo = movieUriDto.getRestrictionInfo();
        RestrictionInfo restrictionInfoQ = restrictionInfo != null ? Q(restrictionInfo) : null;
        String hintText = movieUriDto.getHintText();
        List<AdInfo> adInfo = movieUriDto.getAdInfo();
        if (adInfo != null) {
            ArrayList arrayList = new ArrayList(wu0.V(adInfo, 10));
            for (AdInfo adInfo2 : adInfo) {
                int time = adInfo2.getTime();
                Map<String, String> queryStrings = adInfo2.getQueryStrings();
                if (queryStrings == null) {
                    queryStrings = kotlin.collections.b.I();
                }
                arrayList.add(new ir.myket.movie.common.domain.models.AdInfo(time, ml9.A(queryStrings)));
            }
            pj3VarZ = ml9.z(arrayList);
        } else {
            pj3VarZ = null;
        }
        PlayerRecommendationDto playerRecommendationDto = movieUriDto.getPlayerRecommendationDto();
        RecommendationTime recommendationTime = new RecommendationTime(playerRecommendationDto != null ? playerRecommendationDto.getSecond() : 0);
        CreditsDto credits2 = movieUriDto.getCredits();
        if (credits2 != null) {
            MovieCreditDto openingCredit = credits2.getOpeningCredit();
            MovieCredit movieCredit = openingCredit != null ? new MovieCredit(openingCredit.getStartTime(), openingCredit.getEndTime()) : null;
            MovieCreditDto closingCredit = credits2.getClosingCredit();
            credits = new Credits(movieCredit, closingCredit != null ? new MovieCredit(closingCredit.getStartTime(), closingCredit.getEndTime()) : null);
        } else {
            credits = null;
        }
        SampleWatchDto sampleWatch2 = movieUriDto.getSampleWatch();
        if (sampleWatch2 != null) {
            String boxTitle = sampleWatch2.getBoxTitle();
            String hint = sampleWatch2.getHint();
            String dialogTitle = sampleWatch2.getDialogTitle();
            if (dialogTitle == null) {
                dialogTitle = "";
            }
            String dialogDescription = sampleWatch2.getDialogDescription();
            RestrictionInfoButtonDto primaryButton = sampleWatch2.getPrimaryButton();
            if (primaryButton != null) {
                z = zI;
                restrictionButton = new RestrictionButton(primaryButton.getActionText(), primaryButton.getAction());
            } else {
                z = zI;
                restrictionButton = null;
            }
            sampleWatch = new SampleWatch(boxTitle, hint, dialogTitle, dialogDescription, restrictionButton);
        } else {
            z = zI;
            sampleWatch = null;
        }
        List<String> preferredMimeType = movieUriDto.getPreferredMimeType();
        pj3 pj3VarZ3 = preferredMimeType != null ? ml9.z(preferredMimeType) : null;
        String thumbnail = movieUriDto.getThumbnail();
        String orientation = movieUriDto.getOrientation();
        Enum r7 = Orientation.b;
        z0 z0Var = (z0) Orientation.d;
        z0Var.getClass();
        w0 w0Var = new w0(0, z0Var);
        while (true) {
            if (!w0Var.hasNext()) {
                next = null;
                break;
            }
            next = w0Var.next();
            w0 w0Var2 = w0Var;
            if (m88.T(((Enum) next).name(), orientation, true)) {
                break;
            }
            w0Var = w0Var2;
        }
        Enum r2 = (Enum) next;
        if (r2 != null) {
            r7 = r2;
        }
        return new MovieUri(pj3VarZ2, z, openingCreditsTime, playerConfig, zI2, restrictionInfoQ, hintText, pj3VarZ, recommendationTime, credits, sampleWatch, pj3VarZ3, thumbnail, (Orientation) r7, js3.i(movieUriDto.getAudioMode(), Boolean.TRUE));
    }

    public static final void a(hx4 hx4Var, final String str, final String str2, final boolean z, final boolean z2, final bp2 bp2Var, final bp2 bp2Var2, qz0 qz0Var, final int i2) {
        final hx4 hx4Var2;
        qz0 qz0Var2 = qz0Var;
        js3.p(str, "confirmText");
        js3.p(str2, "cancelText");
        qz0Var2.c0(-1328150803);
        int i3 = i2 | 6 | (qz0Var2.f(str) ? 32 : 16) | (qz0Var2.f(str2) ? 256 : 128) | (qz0Var2.g(z) ? 2048 : 1024) | (qz0Var2.g(z2) ? 16384 : 8192) | (qz0Var2.h(bp2Var) ? 131072 : 65536) | (qz0Var2.h(bp2Var2) ? 1048576 : 524288);
        if (qz0Var2.R(i3 & 1, (599187 & i3) != 599186)) {
            ex4 ex4Var = ex4.b;
            hx4 hx4VarZ = yh0.z(androidx.compose.foundation.layout.b.c(ex4Var, 1.0f), ml9.q(hq6.space_16, qz0Var2));
            fv fvVar = jv.a;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_16, qz0Var2)), eq.l, qz0Var2, 0);
            long j = qz0Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarZ);
            hz0.d0.getClass();
            bp2 bp2Var3 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var3);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cb7VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            double d2 = 1.0f;
            if (d2 <= 0.0d) {
                pn3.a("invalid weight; must be greater than zero");
            }
            hx4 hx4VarB = androidx.compose.foundation.layout.b.b(new a24(1.0f, true), 0.0f, ml9.q(hq6.size_44, qz0Var2), 1);
            boolean z3 = z && !z2;
            ka7 ka7VarA = la7.a(ml9.q(hq6.radius_8, qz0Var2));
            wy5 wy5Var = ci0.a;
            androidx.compose.material3.a.a(bp2Var2, hx4VarB, z3, ka7VarA, ci0.a(wu8.x(qz0Var2).g, wu8.x(qz0Var2).h, wu8.x(qz0Var2).p, wu8.x(qz0Var2).q, qz0Var2, 0), null, null, null, s7.X(781328705, new zh(z2, str), qz0Var2), qz0Var2, ((i3 >> 18) & 14) | 805306368, 480);
            qz0Var2 = qz0Var2;
            if (d2 <= 0.0d) {
                pn3.a("invalid weight; must be greater than zero");
            }
            hx4 hx4VarB2 = androidx.compose.foundation.layout.b.b(new a24(1.0f, true), 0.0f, ml9.q(hq6.size_44, qz0Var2), 1);
            ka7 ka7VarA2 = la7.a(ml9.q(hq6.radius_8, qz0Var2));
            long j2 = wu8.x(qz0Var2).g;
            long j3 = zu0.h;
            lv0 lv0Var = (lv0) qz0Var2.j(mv0.a);
            bi0 bi0Var = lv0Var.X;
            if (bi0Var == null) {
                long j4 = zu0.g;
                bi0Var = new bi0(j4, mv0.c(lv0Var, yw5.c), j4, zu0.b(yw5.b, mv0.c(lv0Var, yw5.a)));
                lv0Var.X = bi0Var;
            }
            androidx.compose.material3.a.b(bp2Var, hx4VarB2, false, ka7VarA2, bi0Var.a(j3, j2, j3, j3), ja1.a(ml9.q(hq6.size_1, qz0Var2), wu8.x(qz0Var2).g), null, s7.X(1031092291, new df0(str2, 0), qz0Var2), qz0Var2, ((i3 >> 15) & 14) | 805306368);
            qz0Var2.q(true);
            hx4Var2 = ex4Var;
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(str, str2, z, z2, bp2Var, bp2Var2, i2) { // from class: ef0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ bp2 f;
                public final /* synthetic */ bp2 g;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    ub1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static float b(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final nn3 c(px3 px3Var, String str) {
        return new nn3(str, new on3(px3Var));
    }

    public static final long d(int i2) {
        long j = (((long) i2) << 32) | (((long) 0) & 4294967295L);
        int i3 = tx3.F;
        return j;
    }

    public static float e(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(defpackage.hx4 r19, final defpackage.dy6 r20, defpackage.dp2 r21, final int r22, defpackage.qz0 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub1.f(hx4, dy6, dp2, int, qz0, int, int):void");
    }

    public static final void g(hx4 hx4Var, PlayerMovieData playerMovieData, wd6 wd6Var, xc6 xc6Var, dl5 dl5Var, String str, bp2 bp2Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        ex4 ex4Var;
        boolean z;
        boolean z2;
        boolean z3;
        qz0 qz0Var2 = qz0Var;
        js3.p(playerMovieData, "playerMovieData");
        js3.p(wd6Var, "playerControllerState");
        boolean z4 = wd6Var.g;
        js3.p(xc6Var, "playerConfig");
        js3.p(dl5Var, "navigationStateManager");
        js3.p(str, "topBarTitle");
        js3.p(bp2Var, "progressBarTimeState");
        qz0Var2.c0(-1515166353);
        int i3 = i2 | (qz0Var2.h(playerMovieData) ? 32 : 16) | (qz0Var2.f(wd6Var) ? 256 : 128) | (qz0Var2.f(xc6Var) ? 2048 : 1024) | (qz0Var2.f(dl5Var) ? 16384 : 8192) | (qz0Var2.f(str) ? 131072 : 65536) | (qz0Var2.h(bp2Var) ? 1048576 : 524288) | (qz0Var2.h(dp2Var) ? 8388608 : 4194304) | (qz0Var2.h(dp2Var2) ? 67108864 : 33554432);
        if (qz0Var2.R(i3 & 1, (38347923 & i3) != 38347922)) {
            hx4 hx4VarF = rq4.f(hx4Var.d(androidx.compose.foundation.layout.b.c), zu0.g, tt3.d);
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j = qz0Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarF);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var2, qp2Var, cl4VarD);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i4);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var3 = d.h;
            ia7.n(qz0Var2, dp2Var3);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC);
            boolean z5 = wd6Var.f;
            ex4 ex4Var2 = ex4.b;
            ng0 ng0Var = ng0.a;
            if (!z5 || z4) {
                qz0Var2.a0(619918779);
                hx4 hx4VarA = ng0Var.a(androidx.compose.foundation.layout.b.c(ex4Var2, 1.0f), eq.d);
                vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
                long j2 = qz0Var2.T;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                j56 j56VarL2 = qz0Var2.l();
                hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
                qz0Var2.e0();
                if (qz0Var2.S) {
                    qz0Var2.k(bp2Var2);
                } else {
                    qz0Var2.o0();
                }
                ia7.o(qz0Var2, qp2Var, vv0VarA);
                ia7.o(qz0Var2, qp2Var2, j56VarL2);
                ia7.g(qz0Var2, Integer.valueOf(i5), qp2Var3);
                ia7.n(qz0Var2, dp2Var3);
                ia7.o(qz0Var2, qp2Var4, hx4VarC2);
                int i6 = i3 >> 15;
                ex4Var = ex4Var2;
                z = true;
                l87.c(null, str, dp2Var, qz0Var, ((i3 >> 12) & 112) | (i6 & 896), 1);
                qz0Var2 = qz0Var;
                if (z4) {
                    z2 = false;
                    qz0Var2.a0(1115817532);
                } else {
                    qz0Var2.a0(174624999);
                    String str2 = playerMovieData.a.g;
                    if (str2 == null) {
                        qz0Var2.a0(1118407674);
                        z2 = false;
                    } else {
                        z2 = false;
                        qz0Var2.a0(1118407675);
                        tt3.e(null, str2, wd6Var, dp2Var2, qz0Var2, (i3 & 896) | (i6 & 7168));
                    }
                    qz0Var2.q(z2);
                }
                qz0Var2.q(z2);
                qz0Var2.q(true);
                if (z4) {
                    z3 = false;
                    qz0Var2.a0(617679277);
                } else {
                    qz0Var2.a0(620501021);
                    zk8.j(yh0.D(ng0Var.a(ex4Var, eq.g), 0.0f, 0.0f, 0.0f, ml9.q(hq6.space_16, qz0Var2), 7), wd6Var, dp2Var2, true, qz0Var2, ((i3 >> 3) & 112) | 3072 | ((i3 >> 18) & 896), 0);
                    z3 = false;
                }
                qz0Var2.q(z3);
                qz0Var2.q(z3);
            } else {
                qz0Var2.a0(617679277);
                qz0Var2.q(false);
                ex4Var = ex4Var2;
                z = true;
            }
            int i7 = i3 >> 6;
            int i8 = ((i3 >> 3) & 1008) | ((i3 << 6) & 7168) | (57344 & i7) | (458752 & (i3 << 3)) | (i7 & 3670016);
            qz0 qz0Var3 = qz0Var2;
            dy3.c(i8, qz0Var3, bp2Var, dp2Var2, ng0Var.a(ex4Var, eq.j), dl5Var, xc6Var, wd6Var, playerMovieData);
            qz0Var2 = qz0Var3;
            qz0Var2.q(z);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new d00(hx4Var, playerMovieData, wd6Var, xc6Var, dl5Var, str, bp2Var, dp2Var, dp2Var2, i2, 2);
        }
    }

    public static final void h(pj3 pj3Var, dp2 dp2Var, int i2, qz0 qz0Var, int i3) {
        int i4;
        qz0Var.c0(1589223370);
        if ((i3 & 6) == 0) {
            i4 = (qz0Var.h(pj3Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= qz0Var.d(i2) ? 256 : 128;
        }
        if (qz0Var.R(i4 & 1, (i4 & 147) != 146)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            hx4 hx4VarF = rq4.f(fillElement, ((tj8) objJ).i, xq2.a(ml9.q(hq6.radius_12, qz0Var), 0.0f, 14));
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var, 0);
            long j = qz0Var.T;
            int i5 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarF);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, vv0VarA);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            j(i2, (i4 >> 6) & 14, qz0Var);
            k(pj3Var, dp2Var, qz0Var, i4 & 126);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new fa(pj3Var, dp2Var, i2, i3);
        }
    }

    public static final void i(hx4 hx4Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(624121861);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            zk8.b(l.n.a(LayoutDirection.a), s7.X(-1139168059, new iz(hx4Var, dp2Var, 14), qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new xm0(i2, 1, dp2Var, hx4Var);
        }
    }

    public static final void j(final int i2, final int i3, qz0 qz0Var) {
        int i4;
        qz0Var.c0(-1226690421);
        if ((i3 & 6) == 0) {
            i4 = (qz0Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if (qz0Var.R(i4 & 1, (i4 & 3) != 2)) {
            String strF = ln2.f(i2, qz0Var);
            gj8 gj8Var = ((wf5) qz0Var.j(aw8.a)).g;
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            long j = ((tj8) objJ).j;
            WeakHashMap weakHashMap = rf9.w;
            mi8.b(strF, yh0.C(vy2.P(ex4.b, new s64(js8.l(qz0Var).l, 16)), ml9.q(hq6.space_8, qz0Var), ml9.q(hq6.space_8, qz0Var), ml9.q(hq6.space_8, qz0Var), ml9.q(hq6.space_4, qz0Var)), j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131064);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: cu5
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iW = hs9.W(i3 | 1);
                    ub1.j(i2, iW, (qz0) obj);
                    return tx8.a;
                }
            };
        }
    }

    public static final void k(pj3 pj3Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(-857981766);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(pj3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            wy5 wy5Var = new wy5(ml9.q(hq6.space_8, qz0Var), ml9.q(hq6.space_4, qz0Var), ml9.q(hq6.space_8, qz0Var), ml9.q(hq6.space_8, qz0Var));
            fv fvVar = jv.a;
            ev evVarG = jv.g(ml9.q(hq6.space_8, qz0Var));
            boolean zH = qz0Var.h(pj3Var) | ((i3 & 112) == 32);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new v25(pj3Var, dp2Var, 9);
                qz0Var.l0(objM);
            }
            vy2.b(0, 491, null, evVarG, qz0Var, null, (dp2) objM, null, wy5Var, null, null, false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(pj3Var, dp2Var, i2, 6);
        }
    }

    public static Object l(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void m(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void n(t3 t3Var, c cVar) {
        en7 en7Var = cVar.d;
        v97 v97Var = (v97) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.y);
        if (wq2.c(cVar)) {
            if (v97Var != null && v97Var.a == 8) {
                return;
            }
            e3 e3Var = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.y);
            if (e3Var != null) {
                t3Var.b(new o3(R.id.accessibilityActionPageUp, e3Var.a));
            }
            e3 e3Var2 = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.A);
            if (e3Var2 != null) {
                t3Var.b(new o3(R.id.accessibilityActionPageDown, e3Var2.a));
            }
            e3 e3Var3 = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.z);
            if (e3Var3 != null) {
                t3Var.b(new o3(R.id.accessibilityActionPageLeft, e3Var3.a));
            }
            e3 e3Var4 = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.B);
            if (e3Var4 != null) {
                t3Var.b(new o3(R.id.accessibilityActionPageRight, e3Var4.a));
            }
        }
    }

    public static sj5 o(TypedValue typedValue, sj5 sj5Var, sj5 sj5Var2, String str, String str2) throws XmlPullParserException {
        if (sj5Var == null || sj5Var == sj5Var2) {
            return sj5Var == null ? sj5Var2 : sj5Var;
        }
        StringBuilder sbT = rm7.t("Type is ", str, " but found ", str2, ": ");
        sbT.append(typedValue.data);
        throw new XmlPullParserException(sbT.toString());
    }

    public static StaticLayout p(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            sn3.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            sn3.a("invalid end value");
        }
        if (i4 < 0) {
            sn3.a("invalid maxLines value");
        }
        if (i2 < 0) {
            sn3.a("invalid width value");
        }
        if (i5 < 0) {
            sn3.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i7);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            fz.t(builderObtain, i6);
        }
        if (i11 >= 28) {
            ul.I(builderObtain);
        }
        if (i11 >= 33) {
            q3.s(builderObtain, i8, i9);
        }
        if (i11 >= 35) {
            hz1.c(builderObtain);
        }
        return builderObtain.build();
    }

    public static at2 q(int i2) {
        return i2 != 0 ? i2 != 1 ? new ma7() : new h91() : new ma7();
    }

    public static int r(int i2, int i3, String str, boolean z) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int s(float f2, int i2, int i3) {
        if (i2 == i3 || f2 <= 0.0f) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = ((i3 >> 24) & 255) / 255.0f;
        float fB = b(((i2 >> 16) & 255) / 255.0f);
        float fB2 = b(((i2 >> 8) & 255) / 255.0f);
        float fB3 = b((i2 & 255) / 255.0f);
        float fB4 = b(((i3 >> 16) & 255) / 255.0f);
        float fB5 = b(((i3 >> 8) & 255) / 255.0f);
        float fB6 = b((i3 & 255) / 255.0f);
        float f5 = dw1.f(f4, f3, f2, f3);
        float f6 = dw1.f(fB4, fB, f2, fB);
        float f7 = dw1.f(fB5, fB2, f2, fB2);
        float f8 = dw1.f(fB6, fB3, f2, fB3);
        float fE = e(f6) * 255.0f;
        float fE2 = e(f7) * 255.0f;
        return Math.round(e(f8) * 255.0f) | (Math.round(fE) << 16) | (Math.round(f5 * 255.0f) << 24) | (Math.round(fE2) << 8);
    }

    public static byte[] t(xa1 xa1Var, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        w58 w58Var = new w58(xa1Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        vy2.u(uri, "The uri must be set.");
        db1 db1Var = new db1(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i2 = 0;
        int i3 = 0;
        db1 db1VarA = db1Var;
        while (true) {
            try {
                bb1 bb1Var = new bb1(w58Var, db1VarA);
                try {
                    byte[] bArrB = pj0.b(bb1Var);
                    j29.g(bb1Var);
                    return bArrB;
                } catch (HttpDataSource$InvalidResponseCodeException e2) {
                    try {
                        int i4 = e2.e;
                        String str2 = null;
                        if ((i4 == 307 || i4 == 308) && i3 < 5 && (map2 = e2.f) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i2);
                        }
                        if (str2 == null) {
                            throw e2;
                        }
                        i3++;
                        cb1 cb1VarA = db1VarA.a();
                        cb1VarA.a = Uri.parse(str2);
                        db1VarA = cb1VarA.a();
                        j29.g(bb1Var);
                    } catch (Throwable th) {
                        j29.g(bb1Var);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                throw new MediaDrmCallbackException(db1Var, w58Var.c, w58Var.a.k(), w58Var.b, e3);
            }
        }
    }

    public static void u(int i2, h26 h26Var) {
        h26Var.G(7);
        byte[] bArr = h26Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static final String v(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static float w(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static boolean x(int i2, CharSequence charSequence) {
        if (i2 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i2);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean y(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean z(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
