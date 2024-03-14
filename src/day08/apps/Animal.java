package day08.apps;

public class Animal { }

class Dog extends Animal implements Playable, Petable{ } //IsFriendly

class Lion extends Animal implements Wild { }

class Duck extends Animal implements Flyable, Swimable{ }

class Dolphin extends Animal implements Playable, Swimable, Petable{ } // IsFriendly

class Parrot extends Animal implements Flyable{ }

// Interface:

interface Playable {}

interface Swimable {}

interface Wild {}

interface Flyable {}

interface Petable {}

interface IsFriendly extends Playable, Petable {}






