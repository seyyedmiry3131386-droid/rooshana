package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import ir.mservices.market.download.movie.recycler.MovieDownloadData;
import ir.mservices.market.download.movie.recycler.a;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class w25 implements ze2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MovieDownloadData b;
    public final /* synthetic */ a c;

    public w25(MovieDownloadData movieDownloadData, a aVar) {
        this.b = movieDownloadData;
        this.c = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CharSequence charSequenceE;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        a aVar = this.c;
        MovieDownloadData movieDownloadData = this.b;
        switch (i) {
            case 0:
                u25 u25Var = (u25) obj;
                MyketTextView myketTextView = aVar.z().z;
                MovieDownloadMetaData movieDownloadMetaData = movieDownloadData.a;
                View view = aVar.a;
                boolean z = u25Var instanceof s25;
                if (z) {
                    String string = view.getResources().getString(rs6.downloaded_and_ready_to_play);
                    js3.o(string, "getString(...)");
                    SpannableString spannableString = new SpannableString(string);
                    spannableString.setSpan(new ForegroundColorSpan(sj8.b().x), 0, string.length(), 33);
                    charSequenceE = spannableString;
                } else if (u25Var instanceof r25) {
                    r25 r25Var = (r25) u25Var;
                    String str = r25Var.b;
                    if (str == null) {
                        Integer num = r25Var.a;
                        String string2 = num != null ? view.getResources().getString(num.intValue()) : null;
                        str = string2 == null ? "" : string2;
                    }
                    SpannableString spannableString2 = new SpannableString(str);
                    spannableString2.setSpan(new ForegroundColorSpan(sj8.b().j), 0, str.length(), 33);
                    charSequenceE = spannableString2;
                } else if (u25Var instanceof t25) {
                    Resources resources = view.getResources();
                    int i2 = rs6.movie_download_in_queue;
                    String str2 = movieDownloadMetaData.g;
                    Resources resources2 = view.getResources();
                    int i3 = ((t25) u25Var).a;
                    String string3 = resources.getString(i2, str2, resources2.getString(i3));
                    js3.o(string3, "getString(...)");
                    String string4 = view.getResources().getString(i3);
                    js3.o(string4, "getString(...)");
                    int iL0 = f88.l0(string3, string4, 0, false, 6);
                    int length = string4.length() + iL0;
                    SpannableString spannableString3 = new SpannableString(string3);
                    spannableString3.setSpan(new ForegroundColorSpan(sj8.b().j), iL0, length, 33);
                    charSequenceE = spannableString3;
                } else if (u25Var instanceof p25) {
                    charSequenceE = movieDownloadMetaData.g;
                } else {
                    if (!(u25Var instanceof q25)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lw8 lw8Var = aVar.y;
                    if (lw8Var == null) {
                        js3.V("uiUtils");
                        throw null;
                    }
                    charSequenceE = lw8.e(lw8Var, view.getResources().getString(rs6.movie_download_in_progress_placeholders, String.valueOf(((q25) u25Var).b), movieDownloadMetaData.g));
                }
                myketTextView.setText(charSequenceE);
                ImageView imageView = aVar.z().y;
                imageView.setImageResource(a.y(aVar, u25Var));
                imageView.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
                aVar.z().x.setTrackColor(a.x(aVar, u25Var));
                if (u25Var instanceof q25) {
                    int i4 = ((q25) u25Var).b * 100;
                    if (aVar.D) {
                        aVar.z().x.setProgress(i4);
                        aVar.D = false;
                    } else if (aVar.z().x.getProgress() > i4) {
                        aVar.z().x.setProgress(i4);
                    } else {
                        ValueAnimator valueAnimator = aVar.A;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(aVar.z().x.getProgress(), i4);
                        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfInt.setDuration(1000L);
                        valueAnimatorOfInt.addUpdateListener(new qj(12, aVar));
                        valueAnimatorOfInt.start();
                        aVar.A = valueAnimatorOfInt;
                    }
                } else if (u25Var instanceof p25) {
                    Integer num2 = ((p25) u25Var).a;
                    aVar.z().x.setProgress((num2 != null ? num2.intValue() : 100) * 100);
                } else if (u25Var instanceof t25) {
                    Integer num3 = ((t25) u25Var).b;
                    if (num3 != null) {
                        aVar.z().x.setProgress(num3.intValue() * 100);
                    }
                } else {
                    if (!z && !(u25Var instanceof r25)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.z().x.setProgress(10000);
                }
                aVar.z().A.setText(movieDownloadData.a.e);
                return tx8Var;
            default:
                Pair pair = (Pair) obj;
                MovieDownloadMetaData movieDownloadMetaData2 = movieDownloadData.a;
                if (!m88.T((String) pair.a, movieDownloadMetaData2.l, true) || ((Number) pair.b).intValue() != movieDownloadMetaData2.f) {
                    movieDownloadMetaData2 = null;
                }
                if (movieDownloadMetaData2 != null) {
                    String string5 = aVar.a.getResources().getString(rs6.free_space_error_movie);
                    js3.o(string5, "getString(...)");
                    MyketTextView myketTextView2 = aVar.z().A;
                    SpannableString spannableString4 = new SpannableString(string5);
                    spannableString4.setSpan(new ForegroundColorSpan(sj8.b().j), 0, string5.length(), 33);
                    myketTextView2.setText(spannableString4);
                    aVar.z().y.setImageResource(a.y(aVar, new p25(null)));
                    aVar.z().x.setTrackColor(a.x(aVar, new p25(null)));
                }
                return tx8Var;
        }
    }

    public w25(a aVar, MovieDownloadData movieDownloadData) {
        this.c = aVar;
        this.b = movieDownloadData;
    }
}
