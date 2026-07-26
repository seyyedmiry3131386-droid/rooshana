package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.b77;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw8;
import defpackage.mq;
import defpackage.oq;
import defpackage.q39;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.u91;
import defpackage.yq6;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInfoView extends Hilt_AppInfoView {
    public final mq c;
    public lw8 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppInfoView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public static /* synthetic */ void setData$default(AppInfoView appInfoView, float f, DownloadSummaryDto downloadSummaryDto, int i, Object obj) {
        if ((i & 2) != 0) {
            downloadSummaryDto = null;
        }
        appInfoView.setData(f, downloadSummaryDto);
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.d;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void setData(float f, DownloadSummaryDto downloadSummaryDto) {
        Drawable drawable;
        int i = 0;
        boolean z = f >= 0.5f;
        mq mqVar = this.c;
        if (z) {
            mqVar.A.setText(getUiUtils().f(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1))));
        }
        boolean z2 = downloadSummaryDto != null;
        MyketTextView myketTextView = mqVar.v;
        ImageView imageView = mqVar.x;
        js3.o(myketTextView, "downloadCount");
        myketTextView.setVisibility(z2 ? 0 : 8);
        js3.o(imageView, "downloadIcon");
        imageView.setVisibility(z2 ? 0 : 8);
        MyketTextView myketTextView2 = mqVar.A;
        js3.o(myketTextView2, "rateText");
        myketTextView2.setVisibility(z ? 0 : 8);
        ImageView imageView2 = mqVar.z;
        js3.o(imageView2, "rateStar");
        imageView2.setVisibility(f > 0.5f ? 0 : 8);
        if (downloadSummaryDto != null) {
            Resources resources = getResources();
            js3.o(resources, "getResources(...)");
            int i2 = yq6.ic_view_downloads;
            try {
                drawable = q39.a(resources, i2, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resources.getDrawable(i2, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            imageView.setImageDrawable(drawable);
            mqVar.v.setText(getContext().getString(rs6.app_info_view_download_count, downloadSummaryDto.getCount(), downloadSummaryDto.getUnitText()));
        }
        View view = mqVar.w;
        js3.o(view, "downloadDivider");
        view.setVisibility((z && z2) ? 0 : 8);
        if (!z && !z2) {
            i = 8;
        }
        setVisibility(i);
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.d = lw8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.d = (lw8) ((u91) ((oq) e())).a.E.get();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = mq.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        mq mqVar = (mq) fa1.c(layoutInflaterFrom, js6.app_info_view, this, true);
        js3.o(mqVar, "inflate(...)");
        this.c = mqVar;
        Drawable drawable = mqVar.z.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        mqVar.y.setLayoutDirection(3);
    }
}
