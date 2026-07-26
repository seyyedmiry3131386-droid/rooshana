package defpackage;

import androidx.cardview.widget.CardView;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.social.welcome.WelcomeAction;
import ir.mservices.market.social.welcome.WelcomeViewModel;
import ir.mservices.market.social.welcome.recycler.a;
import ir.mservices.market.social.welcome.recycler.c;
import ir.mservices.market.webview.WebViewAction;
import ir.mservices.market.webview.WebViewViewModel;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class dd9 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                WebViewViewModel webViewViewModel = (WebViewViewModel) this.b;
                WebViewAction webViewAction = (WebViewAction) ((r50) obj);
                if (webViewAction instanceof WebViewAction.SetupHeaderAction) {
                    webViewViewModel.onSetupHeaderAction((WebViewAction.SetupHeaderAction) webViewAction);
                } else {
                    if (!(webViewAction instanceof WebViewAction.InitAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    webViewViewModel.onInitAction((WebViewAction.InitAction) webViewAction);
                }
                return tx8.a;
            case 1:
                Gender gender = (Gender) obj;
                a aVar = (a) this.b;
                CardView cardView = aVar.y().y;
                js3.o(cardView, "male");
                a.x(aVar, cardView, gender == Gender.e);
                CardView cardView2 = aVar.y().v;
                js3.o(cardView2, "female");
                a.x(aVar, cardView2, gender == Gender.f);
                return tx8.a;
            case 2:
                c.x((c) this.b, (String) obj);
                return tx8.a;
            case 3:
                WelcomeViewModel welcomeViewModel = (WelcomeViewModel) this.b;
                WelcomeAction welcomeAction = (WelcomeAction) ((r50) obj);
                if (welcomeAction instanceof WelcomeAction.ChangeDateAction) {
                    welcomeViewModel.onChangeDateAction((WelcomeAction.ChangeDateAction) welcomeAction);
                } else if (welcomeAction instanceof WelcomeAction.ChangeGenderAction) {
                    welcomeViewModel.onChangeGenderAction((WelcomeAction.ChangeGenderAction) welcomeAction);
                } else if (welcomeAction instanceof WelcomeAction.ChangeNameAction) {
                    welcomeViewModel.onChangeNameAction((WelcomeAction.ChangeNameAction) welcomeAction);
                } else if (welcomeAction instanceof WelcomeAction.DeleteAvatarAction) {
                    welcomeViewModel.onDeleteAvatarAction((WelcomeAction.DeleteAvatarAction) welcomeAction);
                } else if (welcomeAction instanceof WelcomeAction.SkipStepAcion) {
                    welcomeViewModel.onSkipAction((WelcomeAction.SkipStepAcion) welcomeAction);
                } else if (welcomeAction instanceof WelcomeAction.SubmitStepAction) {
                    welcomeViewModel.onSubmitStepAction((WelcomeAction.SubmitStepAction) welcomeAction);
                } else {
                    if (!(welcomeAction instanceof WelcomeAction.ToastAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    welcomeViewModel.onToastAction((WelcomeAction.ToastAction) welcomeAction);
                }
                return tx8.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((dp2) ((wb5) this.b).getValue()).invoke(bool);
                return tx8.a;
            default:
                ((ny4) this.b).a.i(((Number) obj).floatValue());
                return tx8.a;
        }
    }
}
