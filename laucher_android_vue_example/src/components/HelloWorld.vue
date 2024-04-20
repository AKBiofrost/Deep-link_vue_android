<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="12">
        <v-img
          :src="require('../assets/logo.svg')"
          class="my-3"
          contain
          height="200"
        />
      </v-col>

      <v-col class="mb-4">
        <h1 class="display-2 font-weight-bold mb-3">Lanzador de App Android</h1>
      </v-col>

      <v-col class="mb-5" cols="12">
        <h2 class="headline font-weight-bold mb-5">
          Lanzador de App Android por Deep link desde una app Vue.js a una app
          android nativa
        </h2>
        <v-form @submit.prevent>
          <v-text-field
            justify="center"
            class="mx-auto"
            v-model="firstName"
            label="Data send App nativa"
          >
          </v-text-field>

          <v-row justify="center">
            <v-card
              class="mx-auto"
              href="intent://{{ this.dataEncriptada }}#Intent;scheme=laucher_vue_777.surge.sh;package=com.portafolio.urlhandler;end"
              data-wpel-link="Hola a todos, me invoco la App Web"
              prepend-icon="mdi-arrow-expand-all"
              rel="noopener"
              subtitle="ABRIR APP nativa"
              target="_blank"
              title="ABRIR APP"
              @click="getTest()"
            >
            </v-card>
        
            
  
          </v-row>
          <h1>Data enviada: {{  this.dataEncriptada  }}</h1>
        </v-form>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "HelloWorld",
  value: "",

  data: () => ({
    dataEncriptada: null, 
  }),
  methods: {
    getTest() {
      console.log(this.firstName);
      this.dataEncriptada=this.firstName
      console.log("mira valor: "+this.dataEncriptada);
    },
  },
};
</script>
