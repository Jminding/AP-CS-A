<template>
  <MDBContainer>
    <div class="container my-5 py-5">
      <!--Counter-->
      <section class="text-center">
        <!-- Time Counter -->
        <h1 class="mb-0 text-black">
          Black November <span class="text-danger fw-bold">Waiting List</span>
        </h1>
        <hr class="my-5" />
        <p class="text-black lead">
          All offers will be <span class="text-danger fw-bold">limited</span>.
          Don't lose your chance, be the
          <span class="text-danger fw-bold">first</span> to get notified.
        </p>
      </section>
      <!--Counter-->
      <!-- Section: Waiting List -->
      <section class="my-5">
        <div class="bg-dark text-white text-center text-xl-start rounded-6">
          <div
            class="container px-4"
            style="padding-top: 5rem; padding-bottom: 5rem"
          >
            <div
              class="
                row
                mx-xl-1
                d-flex
                justify-content-center justify-xl-content-start
                align-items-center
              "
            >
              <div class="col-md-10 col-lg-7 col-xl-7">
                <h2 class="fs-1 fw-900">
                  Join the waiting list
                  <span class="text-danger fw-bold">NOW</span>
                </h2>
                <p class="lead fw-normal mb-4 pb-md-1 pb-xl-0 mb-xl-0">
                  You will only receive emails related to the Black November
                  promotions and after the promotion is over, you will be
                  unsubscribed. We won't spam you.
                </p>
              </div>
              <div class="col-md-10 col-lg-7 col-xl-5">
                <div class="d-md-flex mb-3 mb-md-2 ms-xl-4">
                  <div class="flex-fill me-md-1 mb-3 mb-md-0">
                    <form
                      action="https://app.convertkit.com/forms/2663020/subscriptions"
                      class="seva-form formkit-form"
                      method="post"
                      data-sv-form="2663020"
                      data-uid="30443eba65"
                      data-format="inline"
                      data-version="5"
                      data-options='{"settings":{"after_subscribe":{"action":"message","success_message":"Success! Now check your email to confirm your subscription.","redirect_url":"https://mdbootstrap.com/confirm/"},"analytics":{"google":null,"facebook":null,"segment":null,"pinterest":null,"sparkloop":null,"googletagmanager":null},"modal":{"trigger":"timer","scroll_percentage":null,"timer":5,"devices":"all","show_once_every":15},"powered_by":{"show":false,"url":"https://convertkit.com?utm_campaign=poweredby&amp;utm_content=form&amp;utm_medium=referral&amp;utm_source=dynamic"},"recaptcha":{"enabled":true},"return_visitor":{"action":"show","custom_content":""},"slide_in":{"display_in":"bottom_right","trigger":"timer","scroll_percentage":null,"timer":5,"devices":"all","show_once_every":15},"sticky_bar":{"display_in":"top","trigger":"timer","scroll_percentage":null,"timer":5,"devices":"all","show_once_every":15}},"version":"5"}'
                    >
                      <!--Errors-->
                      <ul
                        class="text-danger fw-bold"
                        data-element="errors"
                        data-group="alert"
                      ></ul>
                      <!--Fields-->
                      <div
                        data-element="fields"
                        data-stacked="false"
                        class="d-flex d-inline-block justify-content-center"
                      >
                        <!--Email address-->
                        <MDBInput
                          label="Your email address"
                          type="email"
                          id="form1"
                          name="email_address"
                          wrapperClass="form-white w-100"
                        />
                        <!--Button-->
                        <button
                          class="btn btn-danger ms-2"
                          data-element="submit"
                        >
                          JOIN
                        </button>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <p class="text-muted text-center">
          <small
            >By subscribing you agree to receive Black November notifications
            from the data administrator StartupFlow s.c. Kijowska 7, Warsaw.
            <a
              href="https://mdbootstrap.com/general/privacy-policy/"
              class="text-decoration-underline text-reset"
              >Privacy Policy</a
            >.
          </small>
        </p>
      </section>
      <!-- Section: Waiting List -->
      <!--Products-->
      <section class="my-5 pt-5">
        <p class="lead text-center">
          Explore products that will be discounted:
        </p>
        <!--Row-->
        <div class="row">
          <!--Standard-->
          <div class="col-md-3">
            <div class="card shadow-2-strong">
              <div
                class="bg-image hover-overlay ripple"
                data-mdb-ripple-color="light"
              >
                <img
                  src="https://v1.mdbootstrap.com/wp-content/uploads/2021/10/bootstrap-standard.webp"
                  class="img-fluid"
                />
                <a
                  href="https://mdbootstrap.com/docs/standard/pro/"
                  target="_blank"
                >
                  <div
                    class="mask"
                    style="background-color: rgba(251, 251, 251, 0.15)"
                  ></div>
                </a>
              </div>
              <div class="card-body">
                <h5 class="card-title">MDB Standard PRO</h5>
                <p class="card-text">
                  Components, templates, plugins, premium support and much more
                  for the <strong>latest Bootstrap v5 as well as v4</strong>.
                </p>
                <div class="text-end">
                  <a
                    href="https://mdbootstrap.com/docs/standard/pro/"
                    type="button"
                    class="btn btn-sm btn-link text-muted"
                    target="_blank"
                    >View product <i class="fas fa-external-link-alt"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <!--Angular-->
          <div class="col-md-3">
            <div class="card shadow-2-strong">
              <div
                class="bg-image hover-overlay ripple"
                data-mdb-ripple-color="light"
              >
                <img
                  src="https://v1.mdbootstrap.com/wp-content/uploads/2021/10/angular.webp"
                  class="img-fluid"
                />
                <a
                  href="https://mdbootstrap.com/docs/b5/angular/pro/"
                  target="_blank"
                >
                  <div
                    class="mask"
                    style="background-color: rgba(251, 251, 251, 0.15)"
                  ></div>
                </a>
              </div>
              <div class="card-body">
                <h5 class="card-title">MDB Angular PRO</h5>
                <p class="card-text">
                  Components, templates, plugins, premium support and much more
                  for the <strong>latest Bootstrap v5 as well as v4</strong>.
                </p>
                <div class="text-end">
                  <a
                    href="https://mdbootstrap.com/docs/b5/angular/pro/"
                    type="button"
                    class="btn btn-sm btn-link text-muted"
                    target="_blank"
                    >View product <i class="fas fa-external-link-alt"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <!--React-->
          <div class="col-md-3">
            <div class="card shadow-2-strong">
              <div
                class="bg-image hover-overlay ripple"
                data-mdb-ripple-color="light"
              >
                <img
                  src="https://v1.mdbootstrap.com/wp-content/uploads/2021/10/react.webp"
                  class="img-fluid"
                />
                <a
                  href="https://mdbootstrap.com/docs/b5/react/pro/"
                  target="_blank"
                >
                  <div
                    class="mask"
                    style="background-color: rgba(251, 251, 251, 0.15)"
                  ></div>
                </a>
              </div>
              <div class="card-body">
                <h5 class="card-title">MDB React PRO</h5>
                <p class="card-text">
                  Components, templates, plugins, premium support and much more
                  for the <strong>latest Bootstrap v5 as well as v4</strong>.
                </p>
                <div class="text-end">
                  <a
                    href="https://mdbootstrap.com/docs/b5/react/pro/"
                    type="button"
                    class="btn btn-sm btn-link text-muted"
                    target="_blank"
                    >View product <i class="fas fa-external-link-alt"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
          <!--Vue-->
          <div class="col-md-3">
            <div class="card shadow-2-strong">
              <div
                class="bg-image hover-overlay ripple"
                data-mdb-ripple-color="light"
              >
                <img
                  src="https://v1.mdbootstrap.com/wp-content/uploads/2021/10/vue.webp"
                  class="img-fluid"
                />
                <a
                  href="https://mdbootstrap.com/docs/b5/vue/pro/"
                  target="_blank"
                >
                  <div
                    class="mask"
                    style="background-color: rgba(251, 251, 251, 0.15)"
                  ></div>
                </a>
              </div>
              <div class="card-body">
                <h5 class="card-title">MDB Vue PRO</h5>
                <p class="card-text">
                  Components, templates, plugins, premium support and much more
                  for the <strong>latest Bootstrap v5 as well as v4</strong>.
                </p>
                <div class="text-end">
                  <a
                    href="https://mdbootstrap.com/docs/b5/vue/pro/"
                    type="button"
                    class="btn btn-sm btn-link text-muted"
                    target="_blank"
                    >View product <i class="fas fa-external-link-alt"></i
                  ></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!--Products-->
    </div>
  </MDBContainer>
</template>

<script>
import { MDBContainer, MDBInput } from "mdb-vue-ui-kit";

export default {
  name: "HelloWorld",
  components: {
    MDBContainer,
    MDBInput,
  },
  props: {
    msg: String,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.fw-900 {
  font-weight: 900;
}
</style>
