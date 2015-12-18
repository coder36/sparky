require 'capybara'
require 'capybara/cucumber'
require 'capybara/rspec'

Before do
  Capybara.register_driver :selenium do |app|
    Capybara::Selenium::Driver.new(app, :browser => :chrome)
  end

  Capybara.default_driver = :selenium
end