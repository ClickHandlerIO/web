package showcase.client.modules.components.select;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.ReactComponent;
import ui.client.select.Select;

import javax.inject.Inject;

import static jsinterop.annotations.JsPackage.GLOBAL;

public class SnowResortSelect extends Select<SelectDataSource.SnowResort, SnowResortSelect.Props, SnowResortSelect.State> {

    @Inject
    public SnowResortSelect() {
    }

    @Override
    protected String getId(SelectDataSource.SnowResort data) {
        return data.getId();
    }

    @Override
    protected String getLabel(SelectDataSource.SnowResort data) {
        return data.getName();
    }

    @Override
    protected void loadOptions(ReactComponent<Props, State> $this, String search, Func.Run1<SelectDataSource.SnowResort[]> callback) {
        SelectDataSource.fetchData($this.props.state, search, value -> {
            callback.run(value);
        });

       /* log.error("Load Options: " + search);
        $this.dispatch(App.getActions().v1().event().scheduling().surgery().ListSurgeonPhysiciansForScheduling())
                .buildRequest(request -> {
                    Props p = $this.getProps();
                    request.setSearch(search);
                    request.setBizUnitId(p.bizUnitId);
                    request.setProcedureId(p.procedureId);
                    request.setFacilityId(p.hospitalId);
                    log.error("List Physicians Req", request);
                })
                .onResponse(response -> {
                    log.error("List Phys Response", response);
                    if (response == null || !response.code().equals(ListSurgeonPhysiciansForScheduling.Code.SUCCESS)) {
                        log.error(response == null ? "Null Response" : response.getCode());
                        callback.run(null);
                        return;
                    }
                    callback.run(response.getSurgeons());
                })
                .onError(throwable -> {
                    log.error(throwable);
                    callback.run(null);
                });*/
    }

    /*
     * Props and State
     */

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends Select.Props<SelectDataSource.SnowResort> {
        public String state;

        @JsOverlay
        public final Props state(final String state) {
            this.state = state;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
