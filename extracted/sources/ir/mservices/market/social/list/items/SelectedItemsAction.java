package ir.mservices.market.social.list.items;

import defpackage.bl4;
import defpackage.js3;
import defpackage.n99;
import defpackage.o40;
import defpackage.r50;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface SelectedItemsAction extends r50 {

    public static final class AddMoreItem implements SelectedItemsAction {
        public static final AddMoreItem INSTANCE = new AddMoreItem();

        private AddMoreItem() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AddMoreItem);
        }

        public int hashCode() {
            return -911953233;
        }

        public String toString() {
            return "AddMoreItem";
        }
    }

    public static final class ErrorAction implements SelectedItemsAction {
        private final Pair<Integer, Integer> error;

        public ErrorAction(Pair<Integer, Integer> pair) {
            this.error = pair;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorAction copy$default(ErrorAction errorAction, Pair pair, int i, Object obj) {
            if ((i & 1) != 0) {
                pair = errorAction.error;
            }
            return errorAction.copy(pair);
        }

        public final Pair<Integer, Integer> component1() {
            return this.error;
        }

        public final ErrorAction copy(Pair<Integer, Integer> pair) {
            return new ErrorAction(pair);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorAction) && js3.i(this.error, ((ErrorAction) obj).error);
        }

        public final Pair<Integer, Integer> getError() {
            return this.error;
        }

        public int hashCode() {
            Pair<Integer, Integer> pair = this.error;
            if (pair == null) {
                return 0;
            }
            return pair.hashCode();
        }

        public String toString() {
            return "ErrorAction(error=" + this.error + ")";
        }
    }

    public static final class Init implements SelectedItemsAction {
        private final boolean isApp;

        public Init(boolean z) {
            this.isApp = z;
        }

        public static /* synthetic */ Init copy$default(Init init, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = init.isApp;
            }
            return init.copy(z);
        }

        public final boolean component1() {
            return this.isApp;
        }

        public final Init copy(boolean z) {
            return new Init(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && this.isApp == ((Init) obj).isApp;
        }

        public int hashCode() {
            return this.isApp ? 1231 : 1237;
        }

        public final boolean isApp() {
            return this.isApp;
        }

        public String toString() {
            return bl4.x("Init(isApp=", ")", this.isApp);
        }
    }

    public static final class MoveToTopItemAction implements SelectedItemsAction {
        private final SelectableRecyclerData item;

        public MoveToTopItemAction(SelectableRecyclerData selectableRecyclerData) {
            js3.p(selectableRecyclerData, "item");
            this.item = selectableRecyclerData;
        }

        public static /* synthetic */ MoveToTopItemAction copy$default(MoveToTopItemAction moveToTopItemAction, SelectableRecyclerData selectableRecyclerData, int i, Object obj) {
            if ((i & 1) != 0) {
                selectableRecyclerData = moveToTopItemAction.item;
            }
            return moveToTopItemAction.copy(selectableRecyclerData);
        }

        public final SelectableRecyclerData component1() {
            return this.item;
        }

        public final MoveToTopItemAction copy(SelectableRecyclerData selectableRecyclerData) {
            js3.p(selectableRecyclerData, "item");
            return new MoveToTopItemAction(selectableRecyclerData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoveToTopItemAction) && js3.i(this.item, ((MoveToTopItemAction) obj).item);
        }

        public final SelectableRecyclerData getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "MoveToTopItemAction(item=" + this.item + ")";
        }
    }

    public static final class SaveAction implements SelectedItemsAction {
        private final n99 viewState;

        public SaveAction(n99 n99Var) {
            js3.p(n99Var, "viewState");
            this.viewState = n99Var;
        }

        public static /* synthetic */ SaveAction copy$default(SaveAction saveAction, n99 n99Var, int i, Object obj) {
            if ((i & 1) != 0) {
                n99Var = saveAction.viewState;
            }
            return saveAction.copy(n99Var);
        }

        public final n99 component1() {
            return this.viewState;
        }

        public final SaveAction copy(n99 n99Var) {
            js3.p(n99Var, "viewState");
            return new SaveAction(n99Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveAction) && js3.i(this.viewState, ((SaveAction) obj).viewState);
        }

        public final n99 getViewState() {
            return this.viewState;
        }

        public int hashCode() {
            return this.viewState.hashCode();
        }

        public String toString() {
            return "SaveAction(viewState=" + this.viewState + ")";
        }
    }

    public static final class SaveAppAction implements SelectedItemsAction {
        public static final SaveAppAction INSTANCE = new SaveAppAction();

        private SaveAppAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveAppAction);
        }

        public int hashCode() {
            return -1012781024;
        }

        public String toString() {
            return "SaveAppAction";
        }
    }

    public static final class SaveMovieAction implements SelectedItemsAction {
        public static final SaveMovieAction INSTANCE = new SaveMovieAction();

        private SaveMovieAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveMovieAction);
        }

        public int hashCode() {
            return 830617519;
        }

        public String toString() {
            return "SaveMovieAction";
        }
    }

    public static final class SelectItemAction implements SelectedItemsAction {
        private final SelectableRecyclerData item;

        public SelectItemAction(SelectableRecyclerData selectableRecyclerData) {
            js3.p(selectableRecyclerData, "item");
            this.item = selectableRecyclerData;
        }

        public static /* synthetic */ SelectItemAction copy$default(SelectItemAction selectItemAction, SelectableRecyclerData selectableRecyclerData, int i, Object obj) {
            if ((i & 1) != 0) {
                selectableRecyclerData = selectItemAction.item;
            }
            return selectItemAction.copy(selectableRecyclerData);
        }

        public final SelectableRecyclerData component1() {
            return this.item;
        }

        public final SelectItemAction copy(SelectableRecyclerData selectableRecyclerData) {
            js3.p(selectableRecyclerData, "item");
            return new SelectItemAction(selectableRecyclerData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectItemAction) && js3.i(this.item, ((SelectItemAction) obj).item);
        }

        public final SelectableRecyclerData getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "SelectItemAction(item=" + this.item + ")";
        }
    }

    public static final class SetTitleAction implements SelectedItemsAction {
        private final String title;

        public SetTitleAction(String str) {
            js3.p(str, "title");
            this.title = str;
        }

        public static /* synthetic */ SetTitleAction copy$default(SetTitleAction setTitleAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setTitleAction.title;
            }
            return setTitleAction.copy(str);
        }

        public final String component1() {
            return this.title;
        }

        public final SetTitleAction copy(String str) {
            js3.p(str, "title");
            return new SetTitleAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetTitleAction) && js3.i(this.title, ((SetTitleAction) obj).title);
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return o40.y("SetTitleAction(title=", this.title, ")");
        }
    }
}
