package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import ir.mservices.market.movie.download.MovieDownloadButtonState;
import ir.mservices.market.movie.ui.detail.recycler.MovieDownloadEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.a;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class h25 implements ze2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a b;
    public final /* synthetic */ MovieDownloadEpisodeData c;

    public h25(MovieDownloadEpisodeData movieDownloadEpisodeData, a aVar) {
        this.c = movieDownloadEpisodeData;
        this.b = aVar;
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
        CharSequence secondaryTitle;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        a aVar = this.b;
        MovieDownloadEpisodeData movieDownloadEpisodeData = this.c;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                String strA = movieDownloadEpisodeData.a();
                String str = (String) pair.a;
                js3.p(str, "id");
                if (m88.T(strA, "episode_".concat(str), true)) {
                    aVar.x().x.setState((MovieDownloadButtonState) pair.b);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                r43 r43VarX = aVar.x();
                View view = aVar.a;
                MyketTextView myketTextView = r43VarX.y;
                if (zBooleanValue) {
                    String string = view.getResources().getString(rs6.movie_downloaded);
                    js3.o(string, "getString(...)");
                    String string2 = view.getResources().getString(rs6.movie_download_in_queue, string, movieDownloadEpisodeData.a.getSecondaryTitle());
                    js3.o(string2, "getString(...)");
                    int iL0 = f88.l0(string2, string, 0, false, 6);
                    int length = string.length() + iL0;
                    SpannableString spannableString = new SpannableString(string2);
                    spannableString.setSpan(new ForegroundColorSpan(sj8.b().j), iL0, length, 33);
                    secondaryTitle = spannableString;
                } else {
                    secondaryTitle = movieDownloadEpisodeData.a.getSecondaryTitle();
                }
                myketTextView.setText(secondaryTitle);
                break;
        }
        return tx8Var;
    }

    public h25(a aVar, MovieDownloadEpisodeData movieDownloadEpisodeData) {
        this.b = aVar;
        this.c = movieDownloadEpisodeData;
    }
}
