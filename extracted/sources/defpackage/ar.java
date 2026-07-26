package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.app.detail.data.AppDescriptionDto;
import ir.mservices.market.app.detail.ui.recycler.AppMoreDescriptionData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ar extends qg5 {
    public final og5 w;
    public dm3 x;

    public ar(View view, cp cpVar) {
        super(view);
        this.w = cpVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        String shortText;
        String shortText2;
        String shortText3;
        String shortText4;
        String text;
        String shortText5;
        Boolean boolIsRtl;
        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) myketRecyclerData;
        js3.p(appMoreDescriptionData, "data");
        AppDescriptionDto appDescriptionDto = appMoreDescriptionData.c;
        AppDescriptionDto appDescriptionDto2 = appMoreDescriptionData.d;
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        dm3 dm3Var = this.x;
        if (dm3Var == null) {
            js3.V("binding");
            throw null;
        }
        dm3Var.w.w.setSmallIcon(drawable);
        if (appDescriptionDto != null && (boolIsRtl = appDescriptionDto.isRtl()) != null) {
            boolean zBooleanValue = boolIsRtl.booleanValue();
            dm3 dm3Var2 = this.x;
            if (dm3Var2 == null) {
                js3.V("binding");
                throw null;
            }
            dm3Var2.v.setTextDirection(zBooleanValue ? 4 : 3);
        }
        qg5.v(view, this.w, this, appMoreDescriptionData);
        String str = "";
        if (appDescriptionDto2 == null || (shortText = appDescriptionDto2.getShortText()) == null) {
            shortText = "";
        }
        boolean z = true;
        if (f88.n0(shortText) || !appMoreDescriptionData.e) {
            if (appDescriptionDto == null || (shortText2 = appDescriptionDto.getShortText()) == null) {
                shortText2 = "";
            }
            if (f88.n0(shortText2)) {
                z = false;
            } else {
                dm3 dm3Var3 = this.x;
                if (dm3Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                dm3Var3.w.y.setText(view.getResources().getString(rs6.description));
                dm3 dm3Var4 = this.x;
                if (dm3Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = dm3Var4.v;
                if (appDescriptionDto != null && (shortText3 = appDescriptionDto.getShortText()) != null) {
                    str = shortText3;
                }
                myketTextView.setMarkdownText(str);
            }
        } else {
            String str2 = String.format(Locale.US, "%s", Arrays.copyOf(new Object[]{appMoreDescriptionData.b}, 1));
            dm3 dm3Var5 = this.x;
            if (dm3Var5 == null) {
                js3.V("binding");
                throw null;
            }
            gy4 gy4Var = dm3Var5.w;
            gy4Var.y.setText(view.getResources().getString(rs6.whatsnew));
            gy4Var.x.setText(view.getResources().getString(rs6.whatsnew_update_date, str2));
            dm3 dm3Var6 = this.x;
            if (dm3Var6 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView2 = dm3Var6.v;
            if (appDescriptionDto2 == null || (shortText4 = appDescriptionDto2.getShortText()) == null) {
                shortText4 = "";
            }
            myketTextView2.setMarkdownText(shortText4);
            if (appDescriptionDto2 == null || (text = appDescriptionDto2.getText()) == null) {
                text = "";
            }
            if (appDescriptionDto2 != null && (shortText5 = appDescriptionDto2.getShortText()) != null) {
                str = shortText5;
            }
            if (text.equals(str)) {
                dm3 dm3Var7 = this.x;
                if (dm3Var7 == null) {
                    js3.V("binding");
                    throw null;
                }
                SmallBoldTextButton smallBoldTextButton = dm3Var7.w.w;
                js3.o(smallBoldTextButton, "moreTitle");
                smallBoldTextButton.setVisibility(8);
                view.setClickable(false);
            } else {
                dm3 dm3Var8 = this.x;
                if (dm3Var8 == null) {
                    js3.V("binding");
                    throw null;
                }
                dm3Var8.w.w.setVisibility(0);
                view.setClickable(true);
            }
        }
        dm3 dm3Var9 = this.x;
        if (dm3Var9 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = dm3Var9.w.v;
        js3.o(constraintLayout, "layout");
        constraintLayout.setVisibility(z ? 0 : 8);
        dm3 dm3Var10 = this.x;
        if (dm3Var10 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView3 = dm3Var10.v;
        js3.o(myketTextView3, ConfirmDTO.INPUT_TYPE_TEXT);
        myketTextView3.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof dm3) {
            this.x = (dm3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
