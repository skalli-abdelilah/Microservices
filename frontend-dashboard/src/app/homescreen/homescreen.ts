import { Component, ChangeDetectionStrategy, computed, signal } from '@angular/core';

@Component({
  selector: 'app-homescreen',
  template: `
    <main class="homescreen" role="main" aria-labelledby="homescreen-heading">
      <h1 id="homescreen-heading">{{ title() }}</h1>
      <p class="lead">{{ greeting() }}</p>
    </main>
  `,
  styleUrls: ['./homescreen.css'],
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class Homescreen {
  // Local UI state as signals
  readonly title = signal('Welcome to the store');
  readonly name = signal('Abdelilah Skalli');

  // Derived state using computed()
  readonly greeting = computed(() => `Hello — ${this.name()}`);
}
